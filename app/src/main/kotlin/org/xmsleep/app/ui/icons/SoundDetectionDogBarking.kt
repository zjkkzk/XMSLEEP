package org.xmsleep.app.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@Suppress("CheckReturnValue")
val SoundDetectionDogBarking: ImageVector
  get() {
    if (_SoundDetectionDogBarking != null) {
      return _SoundDetectionDogBarking!!
    }
    _SoundDetectionDogBarking =
      ImageVector.Builder(
          name = "sound_detection_dog_barking",
          defaultWidth = 24.dp,
          defaultHeight = 24.dp,
          viewportWidth = 24f,
          viewportHeight = 24f,
        )
        .apply {
          path(
            fill = SolidColor(Color.Black),
            fillAlpha = 1f,
            stroke = null,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Bevel,
            strokeLineMiter = 1f,
            pathFillType = PathFillType.Companion.NonZero,
          ) {
            moveTo(4.85f, 22f)
            verticalLineTo(12.13f)
            horizontalLineToRelative(2f)
            verticalLineTo(20f)
            horizontalLineToRelative(7f)
            verticalLineTo(15.18f)
            lineToRelative(2.63f, -2.63f)
            quadTo(17.2f, 11.83f, 17.6f, 10.93f)
            reflectiveQuadTo(18f, 9f)
            quadTo(18f, 8f, 17.59f, 7.1f)
            reflectiveQuadTo(16.48f, 5.47f)
            lineTo(15.85f, 4.82f)
            lineTo(12.68f, 8f)
            horizontalLineToRelative(-4f)
            lineTo(7.6f, 9.07f)
            lineTo(6.18f, 7.68f)
            lineTo(7.85f, 6f)
            horizontalLineToRelative(4f)
            lineToRelative(4f, -4f)
            lineTo(17.9f, 4.05f)
            quadToRelative(1f, 1f, 1.55f, 2.26f)
            reflectiveQuadTo(20f, 9f)
            reflectiveQuadToRelative(-0.55f, 2.69f)
            reflectiveQuadTo(17.9f, 13.95f)
            lineTo(15.85f, 16f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(9.78f, 17.33f)
            lineToRelative(-5.2f, -5.2f)
            quadTo(4.3f, 11.85f, 4.15f, 11.48f)
            reflectiveQuadTo(4f, 10.7f)
            reflectiveQuadTo(4.15f, 9.94f)
            quadTo(4.3f, 9.57f, 4.58f, 9.3f)
            lineTo(6.68f, 7.18f)
            lineToRelative(3.1f, 3.07f)
            quadToRelative(0.7f, 0.7f, 1.09f, 1.61f)
            reflectiveQuadToRelative(0.39f, 1.91f)
            quadToRelative(0f, 1f, -0.38f, 1.91f)
            reflectiveQuadToRelative(-1.1f, 1.64f)
            close()
          }
        }
        .build()
    return _SoundDetectionDogBarking!!
  }

private var _SoundDetectionDogBarking: ImageVector? = null
