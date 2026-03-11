package org.xmsleep.app.ui.starsky

import android.content.Context
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import org.xmsleep.app.R
import org.xmsleep.app.weather.WeatherCodeMapper
import org.xmsleep.app.weather.WeatherSoundMapper
import org.xmsleep.app.weather.WeatherType

data class DetailedWeatherType(
    val type: WeatherType,
    val labelResId: Int,
    val icon: String
)

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun WeatherEditDialog(
    context: Context,
    weatherCode: Int,
    onDismiss: () -> Unit,
    onRefreshWeather: () -> Unit
) {
    val ctx = LocalContext.current
    
    // 声音ID到string resource的映射
    fun getSoundNameResId(soundId: String): Int = when (soundId) {
        "rain" -> R.string.weather_sound_rain
        "light-rain" -> R.string.weather_sound_light_rain
        "heavy-rain" -> R.string.weather_sound_heavy_rain
        "thunderstorm" -> R.string.weather_sound_thunder
        "wind" -> R.string.weather_sound_wind
        "birds" -> R.string.weather_sound_birds
        "river" -> R.string.weather_sound_river
        "jungle" -> R.string.weather_sound_jungle
        "campfire" -> R.string.weather_sound_fireplace
        "waves" -> R.string.weather_sound_waves
        "drizzle" -> R.string.weather_sound_drizzle
        "walk-in-snow" -> R.string.weather_sound_walk_in_snow
        "night-village" -> R.string.weather_sound_night
        "crickets" -> R.string.weather_sound_crickets
        else -> R.string.weather_sound_rain
    }
    
    var mappings by remember {
        mutableStateOf(WeatherSoundMapper.getMappings(context))
    }
    var selectedWeatherType by remember {
        mutableStateOf(WeatherCodeMapper.toWeatherType(weatherCode))
    }
    var availableSounds by remember {
        mutableStateOf(listOf(
            "rain", "light-rain", "heavy-rain", "thunderstorm", "wind",
            "birds", "river", "jungle", "campfire", "waves",
            "drizzle", "walk-in-snow", "night-village", "crickets"
        ))
    }
    
    val detailedWeatherTypes = listOf(
        DetailedWeatherType(WeatherType.SUNNY_CLEAR, R.string.weather_sunny_clear, "☀️"),
        DetailedWeatherType(WeatherType.SUNNY_NIGHT, R.string.weather_sunny_night, "🌙"),
        DetailedWeatherType(WeatherType.CLOUDY_PARTLY, R.string.weather_cloudy_partly, "⛅"),
        DetailedWeatherType(WeatherType.CLOUDY_OVERCAST, R.string.weather_cloudy_overcast, "☁️"),
        DetailedWeatherType(WeatherType.FOGGY, R.string.weather_foggy, "🌫️"),
        DetailedWeatherType(WeatherType.FOGGY_DRIZZLE, R.string.weather_foggy_drizzle, "🌧️"),
        DetailedWeatherType(WeatherType.RAIN_LIGHT, R.string.weather_rain_light, "🌦️"),
        DetailedWeatherType(WeatherType.RAIN_MODERATE, R.string.weather_rain_moderate, "🌧️"),
        DetailedWeatherType(WeatherType.RAIN_HEAVY, R.string.weather_rain_heavy, "⛈️"),
        DetailedWeatherType(WeatherType.RAIN_SHOWER, R.string.weather_rain_shower, "🌧️"),
        DetailedWeatherType(WeatherType.SNOW_LIGHT, R.string.weather_snow_light, "🌨️"),
        DetailedWeatherType(WeatherType.SNOW_MODERATE, R.string.weather_snow_moderate, "❄️"),
        DetailedWeatherType(WeatherType.SNOW_HEAVY, R.string.weather_snow_heavy, "❄️"),
        DetailedWeatherType(WeatherType.SNOW_SLEET, R.string.weather_snow_sleet, "🌨️"),
        DetailedWeatherType(WeatherType.THUNDERSTORM, R.string.weather_thunderstorm, "⛈️"),
        DetailedWeatherType(WeatherType.THUNDERSTORM_HAIL, R.string.weather_thunderstorm_hail, "⛈️")
    )
    
    val currentMapping = remember(selectedWeatherType, mappings) {
        mappings.find { it.weatherTypes.contains(selectedWeatherType) }
    }
    var selectedSoundIdsList by remember(currentMapping) {
        mutableStateOf(currentMapping?.soundIds ?: emptyList())
    }
    
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(ctx.getString(R.string.weather_sound_mapping))
                TextButton(onClick = onRefreshWeather) {
                    Icon(Icons.Default.Refresh, contentDescription = null, modifier = Modifier.size(18.dp))
                }
            }
        },
        text = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 400.dp)
            ) {
                val weatherDescription = WeatherCodeMapper.toDescription(weatherCode, ctx)
                Text(
                    text = "${ctx.getString(R.string.weather_current)}: $weatherDescription",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.primary
                )
                
                Spacer(modifier = Modifier.height(16.dp))
                
                // 天气类型选择 - 左右滑动
                Text(
                    text = ctx.getString(R.string.weather_select_type),
                    style = MaterialTheme.typography.labelMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    detailedWeatherTypes.forEach { detailedType ->
                        FilterChip(
                            selected = selectedWeatherType == detailedType.type,
                            onClick = { selectedWeatherType = detailedType.type },
                            label = { 
                                Text("${detailedType.icon} ${ctx.getString(detailedType.labelResId)}") 
                            }
                        )
                    }
                }
                
                Spacer(modifier = Modifier.height(16.dp))
                
                // 噪音选择
                Text(
                    text = ctx.getString(R.string.weather_select_sound),
                    style = MaterialTheme.typography.labelMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                
                Column(
                    modifier = Modifier.verticalScroll(rememberScrollState())
                ) {
                    availableSounds.forEach { soundId ->
                        val isSelected = selectedSoundIdsList.contains(soundId)
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    selectedSoundIdsList = if (isSelected) {
                                        selectedSoundIdsList - soundId
                                    } else {
                                        selectedSoundIdsList + soundId
                                    }
                                }
                                .padding(vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Checkbox(
                                checked = isSelected,
                                onCheckedChange = { checked ->
                                    selectedSoundIdsList = if (checked) {
                                        selectedSoundIdsList + soundId
                                    } else {
                                        selectedSoundIdsList - soundId
                                    }
                                }
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(ctx.getString(getSoundNameResId(soundId)))
                        }
                    }
                }
            }
        },
        confirmButton = {
            TextButton(
                onClick = {
                    // 保存映射
                    val newMappings = mappings.toMutableList()
                    newMappings.removeAll { it.weatherTypes.contains(selectedWeatherType) }
                    newMappings.add(
                        WeatherSoundMapper.SoundMapping(
                            weatherTypes = listOf(selectedWeatherType),
                            soundIds = selectedSoundIdsList
                        )
                    )
                    WeatherSoundMapper.saveMappings(context, newMappings)
                    onDismiss()
                }
            ) {
                Text(ctx.getString(R.string.save))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(ctx.getString(R.string.cancel))
            }
        }
    )
}

@Composable
fun ManualWeatherSelectorDialog(
    onDismiss: () -> Unit,
    onWeatherSelected: (Int) -> Unit
) {
    val context = LocalContext.current
    val weatherOptions = listOf(
        0 to "☀️ 晴天",
        1 to "⛅ 晴间多云",
        2 to "⛅ 多云",
        3 to "☁️ 阴",
        45 to "🌫️ 雾",
        51 to "🌧️ 小雾",
        61 to "🌧️ 小雨",
        63 to "🌧️ 中雨",
        65 to "🌧️ 大雨",
        71 to "❄️ 小雪",
        73 to "❄️ 中雪",
        75 to "❄️ 大雪",
        80 to "🌧️ 阵雨",
        95 to "⛈️ 雷暴"
    )
    
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(context.getString(R.string.weather_manual_select)) },
        text = {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState())
            ) {
                Text(
                    text = context.getString(R.string.weather_location_failed),
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp))
                
                weatherOptions.forEach { (code, label) ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onWeatherSelected(code) }
                            .padding(vertical = 12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(label, style = MaterialTheme.typography.bodyLarge)
                    }
                }
            }
        },
        confirmButton = {},
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(context.getString(R.string.cancel))
            }
        }
    )
}
