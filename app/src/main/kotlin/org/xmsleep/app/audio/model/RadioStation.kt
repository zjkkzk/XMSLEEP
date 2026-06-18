package org.xmsleep.app.audio.model

import org.xmsleep.app.R

enum class StationType { Stream, BilibiliLive, BilibiliCategory }

data class RadioStation(
    val id: String,
    val name: String,
    val nameEn: String? = null,
    val genre: String,
    val genreEn: String? = null,
    val tags: List<Int> = emptyList(),
    val url: String = "",
    val isHls: Boolean = false,
    val icon: String = "🎵",
    val type: StationType = StationType.Stream,
    val roomId: String? = null,
    val searchKeyword: String? = null
) {
    companion object {
        val STATIONS = listOf(
            RadioStation(
                id = "bili_ambient",
                name = "电台噪音",
                genre = "Bilibili",
                tags = listOf(R.string.white_noise, R.string.tag_healing, R.string.tag_stress_relief),
                icon = "🌧️",
                type = StationType.BilibiliCategory,
                searchKeyword = "白噪音"
            )
        )

        private val stationMap by lazy { STATIONS.associateBy { it.id } }

        fun getById(id: String): RadioStation? = stationMap[id]

        fun getGenreGroups(): Map<String, List<RadioStation>> =
            STATIONS.groupBy { it.genre }

        val defaultStation: RadioStation get() = STATIONS.first()
    }
}
