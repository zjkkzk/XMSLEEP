package org.xmsleep.app.ui.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.xmsleep.app.audio.AudioManager
import org.xmsleep.app.preferences.PreferencesManager
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    @ApplicationContext private val context: Context
) : ViewModel() {

    private val audioManager = AudioManager.getInstance()

    private val _allPresetRemotePinned = MutableStateFlow<Set<String>>(emptySet())
    val allPresetRemotePinned: StateFlow<Set<String>> = _allPresetRemotePinned.asStateFlow()

    private val _hasAnyPlayingSounds = MutableStateFlow(false)
    val hasAnyPlayingSounds: StateFlow<Boolean> = _hasAnyPlayingSounds.asStateFlow()

    private val _presetSounds = MutableStateFlow<Set<AudioManager.Sound>>(emptySet())

    init {
        observeRemotePinned()
        observeAudioStates()
    }

    private fun observeRemotePinned() {
        viewModelScope.launch {
            PreferencesManager.allPresetRemotePinned.collect { pinned ->
                _allPresetRemotePinned.value = pinned
            }
        }
    }

    private fun observeAudioStates() {
        viewModelScope.launch {
            audioManager.hasAnyPlayingSounds.collect { hasPlaying ->
                _hasAnyPlayingSounds.value = hasPlaying
                if (hasPlaying) {
                    audioManager.startMusicService(context)
                }
            }
        }
    }

    fun updatePresetSounds(presetSounds: Set<AudioManager.Sound>) {
        _presetSounds.value = presetSounds
    }

    fun getAllRemotePinned(): Set<String> {
        return _allPresetRemotePinned.value
    }
}
