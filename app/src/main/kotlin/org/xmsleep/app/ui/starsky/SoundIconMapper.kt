package org.xmsleep.app.ui.starsky

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import org.xmsleep.app.audio.model.SoundMetadata
import org.xmsleep.app.ui.icons.BedroomBaby
import org.xmsleep.app.ui.icons.ChessKnight
import org.xmsleep.app.ui.icons.LocalLaundryService
import org.xmsleep.app.ui.icons.MeasuringTape
import org.xmsleep.app.ui.icons.NestMultiRoom
import org.xmsleep.app.ui.icons.Okonomiyaki
import org.xmsleep.app.ui.icons.OwlIcon
import org.xmsleep.app.ui.icons.PianoIcon
import org.xmsleep.app.ui.icons.Rainy
import org.xmsleep.app.ui.icons.Raven
import org.xmsleep.app.ui.icons.SoundDetectionDogBarking
import org.xmsleep.app.ui.icons.SpaIcon
import org.xmsleep.app.ui.icons.Tonality

fun getSoundIcon(sound: SoundMetadata): ImageVector {
    return when (sound.id) {
        // === Nature ===
        "waves" -> Icons.Default.Surfing
        "campfire" -> Icons.Default.LocalFireDepartment
        "wind" -> Icons.Default.Air
        "howling-wind" -> Icons.Default.Tornado
        "wind-in-trees" -> Icons.Default.Nature
        "walk-in-snow" -> Icons.Default.Snowshoeing
        "field" -> Icons.Default.Agriculture
        "jungle" -> Icons.Default.Forest
        "waterfall" -> Icons.Default.AcUnit
        "droplets" -> Icons.Default.Opacity
        "river" -> Icons.Default.Sailing
        "walk-on-leaves" -> Icons.Default.Park
        "walk-on-gravel" -> Icons.Default.Landscape
        "lake" -> Icons.Default.Water
        "summer-night-insects" -> Icons.Default.NightsStay

        // === Rain ===
        "thunderstorm" -> Icons.Default.Thunderstorm
        "light-rain" -> Icons.Default.Shower
        "heavy-rain" -> Rainy
        "rain-on-car-roof" -> Icons.Default.TimeToLeave
        "rain-on-umbrella" -> Icons.Default.BeachAccess
        "rain-on-tent" -> Icons.Default.Cabin
        "rain-on-leaves" -> Icons.Default.EnergySavingsLeaf
        "rain-on-raincoat" -> Icons.Default.Hiking
        "rain-on-windowsill" -> Icons.Default.Window
        "rain-on-wooden-house" -> Icons.Default.Home
        "rain-while-driving" -> Icons.Default.DirectionsCar
        "rain-on-empty-street" -> Icons.Default.LocationCity
        "drizzle" -> Icons.Default.WaterDrop
        "rain-on-eaves" -> NestMultiRoom
        "heavy-rain-on-glass" -> Icons.Default.Flood
        "rain-on-awning" -> Icons.Default.Deck
        "light-rain-with-wind" -> Icons.Default.Cyclone
        "streaming-rain" -> Icons.Default.Storm
        "bright-rain" -> Icons.Default.WbSunny
        "rain-on-ceiling" -> Icons.Default.Balcony
        "dripping-eaves" -> Icons.Default.WaterDamage

        // === Animals ===
        "crickets" -> Icons.Default.Grass
        "beehive" -> Icons.Default.Hive
        "whale" -> Icons.Default.Tsunami
        "birds" -> Icons.Default.Spoke
        "seagulls" -> Icons.Default.Waves
        "wolf" -> Icons.Default.Pets
        "owl" -> OwlIcon
        "frog" -> Icons.Default.Deblur
        "dog-barking" -> SoundDetectionDogBarking
        "horse-gallop" -> ChessKnight
        "cat-purring" -> Icons.Default.Hearing
        "crows" -> Raven
        "woodpecker" -> Icons.Default.Grain
        "chickens" -> Icons.Default.Egg
        "cows" -> SpaIcon
        "sheep" -> MeasuringTape

        // === Urban ===
        "ambulance-siren" -> Icons.Default.LocalHospital
        "fireworks" -> Icons.Default.AutoAwesome
        "highway" -> Icons.Default.Route
        "road" -> Icons.Default.Signpost
        "busy-street" -> Icons.Default.Commute
        "crowd" -> Icons.Default.People
        "traffic" -> Icons.Default.Traffic

        // === Places ===
        "cafe" -> Icons.Default.LocalCafe
        "airport" -> Icons.Default.FlightTakeoff
        "airplane" -> Icons.Default.FlightLand
        "church" -> Icons.Default.Church
        "temple" -> Icons.Default.TempleHindu
        "construction-site" -> Icons.Default.Build
        "underwater" -> Icons.Default.ScubaDiving
        "crowded-bar" -> Icons.Default.LocalBar
        "night-village" -> Icons.Default.NightShelter
        "subway-station" -> Icons.Default.Subway
        "office" -> Icons.Default.Business
        "supermarket" -> Icons.Default.Store
        "carousel" -> BedroomBaby
        "laboratory" -> Icons.Default.Science
        "laundry-room" -> LocalLaundryService
        "restaurant" -> Icons.Default.Restaurant
        "kitchen" -> Icons.Default.Kitchen
        "eating-chips" -> Icons.Default.Fastfood
        "library" -> Icons.Default.LocalLibrary

        // === Transport ===
        "train" -> Icons.Default.Train
        "inside-a-train" -> Icons.Default.Tram
        "sailboat" -> Icons.Default.DirectionsBoat
        "submarine" -> Icons.Default.Anchor
        "rowing-boat" -> Icons.Default.Rowing

        // === Things ===
        "keyboard" -> Icons.Default.Keyboard
        "typewriter" -> Icons.Default.Article
        "paper" -> Icons.Default.Description
        "clock" -> Icons.Default.Schedule
        "wind-chimes" -> Icons.Default.Tune
        "light-piano" -> Tonality
        "guitar" -> Icons.Default.LibraryMusic
        "guzheng" -> Icons.Default.Audiotrack
        "piano" -> Icons.Default.Piano
        "elegant-piano" -> PianoIcon
        "meditation-harp" -> Icons.Default.Spa
        "singing-bowl" -> Icons.Default.SelfImprovement
        "daydream" -> Icons.Default.Bedtime
        "study" -> Icons.Default.AutoStories
        "tuning-radio" -> Icons.Default.Radio
        "vinyl-effect" -> Okonomiyaki
        "morse-code" -> Icons.Default.Radar
        "boiling-water" -> Icons.Default.SoupKitchen
        "bubbles" -> Icons.Default.Soap
        "slide-projector" -> Icons.Default.Slideshow
        "windshield-wipers" -> Icons.Default.CarRepair
        "washing-machine" -> Icons.Default.LocalLaundryService
        "dryer" -> Icons.Default.Dry
        "ceiling-fan" -> Icons.Default.Hvac
        "fan" -> Icons.Default.WindPower
        "ear-cleaning-1" -> Icons.Default.Earbuds
        "ear-cleaning-2" -> Icons.Default.HearingDisabled

        // === Noise ===
        "white-noise" -> Icons.Default.NoiseAware
        "pink-noise" -> Icons.Default.SurroundSound
        "brown-noise" -> Icons.Default.NoiseControlOff

        else -> when (sound.category) {
            "nature" -> Icons.Default.Park
            "rain" -> Icons.Default.Water
            "animals" -> Icons.Default.Pets
            "urban" -> Icons.Default.LocationCity
            "places" -> Icons.Default.Place
            "transport" -> Icons.Default.DirectionsCar
            "things" -> Icons.Default.Build
            "noise" -> Icons.Default.GraphicEq
            else -> Icons.Default.MusicNote
        }
    }
}
