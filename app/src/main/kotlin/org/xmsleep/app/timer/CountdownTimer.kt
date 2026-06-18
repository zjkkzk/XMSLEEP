package org.xmsleep.app.timer

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit

class CountdownTimer(
    private val scope: CoroutineScope = CoroutineScope(SupervisorJob() + Dispatchers.Main),
    private val onFinished: (() -> Unit)? = null
) {
    private var timerEndTime: Long = 0
    private var currentMinutes: Int = 0

    private val _isActive = MutableStateFlow(false)
    val isActive: StateFlow<Boolean> = _isActive.asStateFlow()

    private val _isPaused = MutableStateFlow(false)
    val isPaused: StateFlow<Boolean> = _isPaused.asStateFlow()

    private val _timeLeftMillis = MutableStateFlow(0L)
    val timeLeftMillis: StateFlow<Long> = _timeLeftMillis.asStateFlow()

    private var pausedTimeLeft: Long = 0
    private var timerJob: Job? = null

    fun start(durationMinutes: Int) {
        cancel()

        if (durationMinutes <= 0) return

        currentMinutes = durationMinutes
        _isActive.value = true
        _isPaused.value = false

        val durationMillis = TimeUnit.MINUTES.toMillis(durationMinutes.toLong())
        timerEndTime = System.currentTimeMillis() + durationMillis
        _timeLeftMillis.value = durationMillis

        timerJob = scope.launch {
            timerLoop()
        }
    }

    fun cancel() {
        _isActive.value = false
        _isPaused.value = false
        currentMinutes = 0
        timerEndTime = 0
        pausedTimeLeft = 0
        _timeLeftMillis.value = 0
        timerJob?.cancel()
        timerJob = null
    }

    fun pause() {
        if (!_isActive.value || _isPaused.value) return
        _isPaused.value = true
        pausedTimeLeft = timerEndTime - System.currentTimeMillis()
        if (pausedTimeLeft < 0) pausedTimeLeft = 0
        timerJob?.cancel()
    }

    fun resume() {
        if (!_isActive.value || !_isPaused.value) return
        _isPaused.value = false
        timerEndTime = System.currentTimeMillis() + pausedTimeLeft
        timerJob = scope.launch {
            timerLoop()
        }
    }

    fun getCurrentMinutes(): Int = currentMinutes

    fun getTimeLeftMillis(): Long = when {
        _isPaused.value -> pausedTimeLeft
        _isActive.value -> (timerEndTime - System.currentTimeMillis()).coerceAtLeast(0)
        else -> 0
    }

    private suspend fun timerLoop() {
        while (_isActive.value && !_isPaused.value) {
            val timeLeft = timerEndTime - System.currentTimeMillis()
            if (timeLeft <= 0) {
                finish()
                break
            }
            _timeLeftMillis.value = timeLeft
            delay(1000)
        }
    }

    private fun finish() {
        _isActive.value = false
        currentMinutes = 0
        timerEndTime = 0
        _timeLeftMillis.value = 0
        onFinished?.invoke()
    }

    fun release() {
        cancel()
        scope.cancel()
    }
}
