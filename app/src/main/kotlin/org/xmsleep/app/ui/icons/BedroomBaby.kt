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
val BedroomBaby: ImageVector
  get() {
    if (_BedroomBaby != null) {
      return _BedroomBaby!!
    }
    _BedroomBaby =
      ImageVector.Builder(
          name = "bedroom_baby",
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
            moveTo(12f, 18f)
            quadToRelative(2f, 0f, 3.8f, -0.75f)
            reflectiveQuadTo(19f, 15.1f)
            lineTo(17.95f, 14.05f)
            quadToRelative(-0.27f, 0.28f, -0.54f, 0.49f)
            reflectiveQuadToRelative(-0.56f, 0.41f)
            lineTo(16f, 13.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(1f)
            verticalLineTo(10f)
            horizontalLineTo(11.4f)
            lineTo(9.65f, 7f)
            horizontalLineTo(6f)
            lineTo(7f, 7.75f)
            lineTo(5.5f, 9.5f)
            lineToRelative(0.95f, 1f)
            lineTo(8f, 9.5f)
            verticalLineToRelative(4f)
            lineTo(7.15f, 14.95f)
            quadTo(6.85f, 14.75f, 6.59f, 14.54f)
            reflectiveQuadTo(6.05f, 14.05f)
            lineTo(5f, 15.1f)
            quadToRelative(1.4f, 1.4f, 3.2f, 2.15f)
            reflectiveQuadTo(12f, 18f)
            close()
            moveToRelative(0f, -1.5f)
            quadToRelative(-0.95f, 0f, -1.84f, -0.19f)
            reflectiveQuadTo(8.45f, 15.7f)
            lineTo(9.3f, 14.25f)
            quadToRelative(0.65f, 0.25f, 1.34f, 0.36f)
            quadToRelative(0.69f, 0.11f, 1.36f, 0.11f)
            quadToRelative(0.7f, 0f, 1.38f, -0.11f)
            reflectiveQuadTo(14.7f, 14.25f)
            lineToRelative(0.85f, 1.45f)
            quadToRelative(-0.82f, 0.38f, -1.71f, 0.59f)
            reflectiveQuadTo(12f, 16.5f)
            close()
            moveTo(4f, 22f)
            quadTo(3.18f, 22f, 2.59f, 21.41f)
            reflectiveQuadTo(2f, 20f)
            verticalLineTo(4f)
            quadTo(2f, 3.17f, 2.59f, 2.59f)
            reflectiveQuadTo(4f, 2f)
            horizontalLineTo(20f)
            quadToRelative(0.83f, 0f, 1.41f, 0.59f)
            reflectiveQuadTo(22f, 4f)
            verticalLineTo(20f)
            quadToRelative(0f, 0.82f, -0.59f, 1.41f)
            reflectiveQuadTo(20f, 22f)
            horizontalLineTo(4f)
            close()
            moveTo(4f, 20f)
            horizontalLineTo(20f)
            verticalLineTo(4f)
            horizontalLineTo(4f)
            verticalLineTo(20f)
            close()
            moveToRelative(0f, 0f)
            verticalLineTo(4f)
            verticalLineTo(20f)
            close()
          }
        }
        .build()
    return _BedroomBaby!!
  }

private var _BedroomBaby: ImageVector? = null
