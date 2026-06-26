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
val Rainy: ImageVector
  get() {
    if (_Rainy != null) {
      return _Rainy!!
    }
    _Rainy =
      ImageVector.Builder(
          name = "rainy",
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
            moveTo(13.95f, 21.9f)
            quadToRelative(-0.38f, 0.2f, -0.76f, 0.06f)
            quadTo(12.8f, 21.83f, 12.6f, 21.45f)
            lineToRelative(-1.5f, -3f)
            quadTo(10.9f, 18.08f, 11.04f, 17.69f)
            reflectiveQuadTo(11.55f, 17.1f)
            reflectiveQuadToRelative(0.76f, -0.06f)
            reflectiveQuadToRelative(0.59f, 0.51f)
            lineToRelative(1.5f, 3f)
            quadToRelative(0.2f, 0.38f, 0.06f, 0.76f)
            reflectiveQuadTo(13.95f, 21.9f)
            close()
            moveToRelative(6f, 0f)
            quadToRelative(-0.38f, 0.2f, -0.76f, 0.06f)
            quadTo(18.8f, 21.83f, 18.6f, 21.45f)
            lineToRelative(-1.5f, -3f)
            quadTo(16.9f, 18.08f, 17.04f, 17.69f)
            reflectiveQuadTo(17.55f, 17.1f)
            reflectiveQuadToRelative(0.76f, -0.06f)
            reflectiveQuadToRelative(0.59f, 0.51f)
            lineToRelative(1.5f, 3f)
            quadToRelative(0.2f, 0.38f, 0.06f, 0.76f)
            reflectiveQuadTo(19.95f, 21.9f)
            close()
            moveToRelative(-12f, 0f)
            quadTo(7.58f, 22.1f, 7.19f, 21.96f)
            quadTo(6.8f, 21.83f, 6.6f, 21.45f)
            lineToRelative(-1.5f, -3f)
            quadTo(4.9f, 18.08f, 5.04f, 17.69f)
            reflectiveQuadTo(5.55f, 17.1f)
            reflectiveQuadTo(6.31f, 17.04f)
            reflectiveQuadTo(6.9f, 17.55f)
            lineToRelative(1.5f, 3f)
            quadToRelative(0.2f, 0.38f, 0.06f, 0.76f)
            reflectiveQuadTo(7.95f, 21.9f)
            close()
            moveTo(7.5f, 16f)
            quadTo(5.23f, 16f, 3.61f, 14.39f)
            reflectiveQuadTo(2f, 10.5f)
            quadTo(2f, 8.42f, 3.38f, 6.88f)
            quadTo(4.75f, 5.32f, 6.78f, 5.05f)
            quadTo(7.58f, 3.63f, 8.96f, 2.81f)
            reflectiveQuadTo(12f, 2f)
            quadToRelative(2.25f, 0f, 3.91f, 1.44f)
            reflectiveQuadToRelative(2.01f, 3.59f)
            quadToRelative(1.73f, 0.15f, 2.9f, 1.43f)
            quadTo(22f, 9.73f, 22f, 11.5f)
            quadToRelative(0f, 1.88f, -1.31f, 3.19f)
            reflectiveQuadTo(17.5f, 16f)
            horizontalLineTo(7.5f)
            close()
            moveToRelative(0f, -2f)
            horizontalLineToRelative(10f)
            quadToRelative(1.05f, 0f, 1.78f, -0.73f)
            reflectiveQuadTo(20f, 11.5f)
            reflectiveQuadTo(19.28f, 9.73f)
            reflectiveQuadTo(17.5f, 9f)
            horizontalLineTo(16f)
            verticalLineTo(8f)
            quadTo(16f, 6.35f, 14.83f, 5.18f)
            reflectiveQuadTo(12f, 4f)
            quadTo(10.8f, 4f, 9.81f, 4.65f)
            quadTo(8.83f, 5.3f, 8.33f, 6.4f)
            lineTo(8.08f, 7f)
            horizontalLineTo(7.45f)
            quadTo(6.03f, 7.05f, 5.01f, 8.06f)
            reflectiveQuadTo(4f, 10.5f)
            quadToRelative(0f, 1.45f, 1.03f, 2.47f)
            reflectiveQuadTo(7.5f, 14f)
            close()
            moveTo(12f, 9f)
            close()
          }
        }
        .build()
    return _Rainy!!
  }

private var _Rainy: ImageVector? = null
