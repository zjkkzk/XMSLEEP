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
val Raven: ImageVector
  get() {
    if (_Raven != null) {
      return _Raven!!
    }
    _Raven =
      ImageVector.Builder(
          name = "raven",
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
            moveTo(8.35f, 22f)
            lineTo(6.5f, 21.25f)
            lineTo(7.95f, 17.73f)
            quadTo(5.3f, 17.02f, 3.65f, 14.88f)
            reflectiveQuadTo(2f, 10f)
            verticalLineTo(6f)
            quadTo(2f, 4.35f, 3.18f, 3.17f)
            reflectiveQuadTo(6f, 2f)
            quadTo(6.55f, 2f, 7.05f, 2.19f)
            reflectiveQuadToRelative(1f, 0.39f)
            lineTo(14f, 5f)
            lineTo(10f, 6.5f)
            verticalLineTo(8f)
            lineToRelative(11f, 7f)
            lineToRelative(1f, 5f)
            horizontalLineTo(20f)
            lineTo(19f, 18f)
            horizontalLineTo(14f)
            verticalLineToRelative(4f)
            horizontalLineTo(12f)
            verticalLineTo(18f)
            horizontalLineTo(10f)
            lineTo(8.35f, 22f)
            close()
            moveTo(10f, 16f)
            horizontalLineToRelative(8.82f)
            lineTo(17.25f, 15f)
            horizontalLineTo(10f)
            quadTo(8.35f, 15f, 7.18f, 13.83f)
            reflectiveQuadTo(6f, 11f)
            horizontalLineTo(8f)
            quadToRelative(0f, 0.82f, 0.59f, 1.41f)
            reflectiveQuadTo(10f, 13f)
            horizontalLineToRelative(4.13f)
            lineTo(8f, 9.1f)
            verticalLineTo(6f)
            quadTo(8f, 5.18f, 7.41f, 4.59f)
            reflectiveQuadTo(6f, 4f)
            reflectiveQuadTo(4.59f, 4.59f)
            quadTo(4f, 5.18f, 4f, 6f)
            verticalLineToRelative(4f)
            quadToRelative(0f, 2.5f, 1.75f, 4.25f)
            reflectiveQuadTo(10f, 16f)
            close()
            moveTo(5.29f, 6.71f)
            quadTo(5f, 6.43f, 5f, 6f)
            reflectiveQuadTo(5.29f, 5.29f)
            reflectiveQuadTo(6f, 5f)
            reflectiveQuadTo(6.71f, 5.29f)
            reflectiveQuadTo(7f, 6f)
            reflectiveQuadTo(6.71f, 6.71f)
            reflectiveQuadTo(6f, 7f)
            quadTo(5.58f, 7f, 5.29f, 6.71f)
            close()
            moveTo(10f, 15f)
            close()
          }
        }
        .build()
    return _Raven!!
  }

private var _Raven: ImageVector? = null
