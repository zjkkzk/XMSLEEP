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
val SpaIcon: ImageVector
  get() {
    if (_SpaIcon != null) {
      return _SpaIcon!!
    }
    _SpaIcon =
      ImageVector.Builder(
          name = "spa",
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
            moveTo(12f, 22f)
            quadTo(10.18f, 21.78f, 8.38f, 21.01f)
            quadTo(6.58f, 20.25f, 5.16f, 18.83f)
            reflectiveQuadTo(2.88f, 15.23f)
            reflectiveQuadTo(2f, 10f)
            verticalLineTo(9f)
            horizontalLineTo(3f)
            quadTo(4.28f, 9f, 5.63f, 9.32f)
            reflectiveQuadTo(8.15f, 10.3f)
            quadTo(8.45f, 8.15f, 9.51f, 5.89f)
            reflectiveQuadTo(12f, 2f)
            quadToRelative(1.43f, 1.63f, 2.49f, 3.89f)
            reflectiveQuadToRelative(1.36f, 4.41f)
            quadTo(17.03f, 9.65f, 18.38f, 9.32f)
            quadTo(19.73f, 9f, 21f, 9f)
            horizontalLineTo(22f)
            verticalLineToRelative(1f)
            quadToRelative(0f, 3.05f, -0.88f, 5.23f)
            reflectiveQuadToRelative(-2.29f, 3.6f)
            reflectiveQuadToRelative(-3.2f, 2.19f)
            reflectiveQuadTo(12f, 22f)
            close()
            moveTo(11.95f, 19.95f)
            quadTo(11.68f, 15.8f, 9.49f, 13.68f)
            reflectiveQuadTo(4.05f, 11.05f)
            quadToRelative(0.28f, 4.28f, 2.54f, 6.38f)
            quadToRelative(2.26f, 2.1f, 5.36f, 2.52f)
            close()
            moveTo(12f, 13.6f)
            quadToRelative(0.38f, -0.55f, 0.91f, -1.14f)
            quadToRelative(0.54f, -0.59f, 1.04f, -1.01f)
            quadTo(13.9f, 10.02f, 13.39f, 8.48f)
            reflectiveQuadTo(12f, 5.45f)
            quadTo(11.13f, 6.93f, 10.61f, 8.48f)
            reflectiveQuadToRelative(-0.56f, 2.97f)
            quadToRelative(0.5f, 0.43f, 1.05f, 1.01f)
            reflectiveQuadTo(12f, 13.6f)
            close()
            moveTo(13.95f, 19.5f)
            quadToRelative(0.92f, -0.3f, 1.92f, -0.88f)
            reflectiveQuadToRelative(1.86f, -1.56f)
            reflectiveQuadTo(19.21f, 14.6f)
            reflectiveQuadToRelative(0.74f, -3.55f)
            quadTo(17.6f, 11.4f, 15.83f, 12.61f)
            reflectiveQuadTo(13.1f, 15.7f)
            quadToRelative(0.3f, 0.8f, 0.51f, 1.75f)
            reflectiveQuadToRelative(0.34f, 2.05f)
            close()
            moveTo(12f, 13.6f)
            close()
            moveTo(13.95f, 19.5f)
            close()
            moveToRelative(-2f, 0.45f)
            close()
            moveTo(13.1f, 15.7f)
            close()
            moveTo(12f, 22f)
            close()
          }
        }
        .build()
    return _SpaIcon!!
  }

private var _SpaIcon: ImageVector? = null
