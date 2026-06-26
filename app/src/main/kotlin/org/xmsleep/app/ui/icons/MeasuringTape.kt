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
val MeasuringTape: ImageVector
  get() {
    if (_MeasuringTape != null) {
      return _MeasuringTape!!
    }
    _MeasuringTape =
      ImageVector.Builder(
          name = "measuring_tape",
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
            moveTo(5f, 20f)
            verticalLineTo(11.5f)
            quadTo(5f, 7.95f, 7.48f, 5.47f)
            reflectiveQuadTo(13.5f, 3f)
            reflectiveQuadToRelative(6.03f, 2.47f)
            reflectiveQuadTo(22f, 11.5f)
            reflectiveQuadToRelative(-2.47f, 6.02f)
            reflectiveQuadTo(13.5f, 20f)
            horizontalLineTo(5f)
            close()
            moveTo(7f, 18f)
            horizontalLineToRelative(6.5f)
            quadToRelative(2.7f, 0f, 4.6f, -1.9f)
            reflectiveQuadTo(20f, 11.5f)
            reflectiveQuadTo(18.1f, 6.9f)
            reflectiveQuadTo(13.5f, 5f)
            reflectiveQuadTo(8.9f, 6.9f)
            reflectiveQuadTo(7f, 11.5f)
            verticalLineTo(18f)
            close()
            moveToRelative(8.98f, -4.03f)
            quadTo(17f, 12.95f, 17f, 11.5f)
            reflectiveQuadTo(15.98f, 9.02f)
            reflectiveQuadTo(13.5f, 8f)
            reflectiveQuadTo(11.03f, 9.02f)
            reflectiveQuadTo(10f, 11.5f)
            reflectiveQuadToRelative(1.03f, 2.47f)
            reflectiveQuadTo(13.5f, 15f)
            reflectiveQuadToRelative(2.48f, -1.03f)
            close()
            moveTo(12.44f, 12.56f)
            quadTo(12f, 12.13f, 12f, 11.5f)
            reflectiveQuadToRelative(0.44f, -1.06f)
            reflectiveQuadTo(13.5f, 10f)
            reflectiveQuadToRelative(1.06f, 0.44f)
            reflectiveQuadTo(15f, 11.5f)
            reflectiveQuadToRelative(-0.44f, 1.06f)
            reflectiveQuadTo(13.5f, 13f)
            reflectiveQuadTo(12.44f, 12.56f)
            close()
            moveTo(2f, 20f)
            verticalLineTo(15f)
            horizontalLineTo(4f)
            verticalLineToRelative(5f)
            horizontalLineTo(2f)
            close()
            moveTo(13.5f, 11.5f)
            close()
          }
        }
        .build()
    return _MeasuringTape!!
  }

private var _MeasuringTape: ImageVector? = null
