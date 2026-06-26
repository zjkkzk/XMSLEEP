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
val NestMultiRoom: ImageVector
  get() {
    if (_NestMultiRoom != null) {
      return _NestMultiRoom!!
    }
    _NestMultiRoom =
      ImageVector.Builder(
          name = "nest_multi_room",
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
            moveTo(4f, 21f)
            verticalLineTo(9f)
            lineTo(12f, 3f)
            lineToRelative(8f, 6f)
            verticalLineTo(21f)
            horizontalLineTo(4f)
            close()
            moveTo(6f, 19f)
            horizontalLineToRelative(7f)
            verticalLineTo(16f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(9f, 0f)
            horizontalLineToRelative(3f)
            verticalLineTo(16f)
            horizontalLineTo(15f)
            verticalLineToRelative(3f)
            close()
            moveTo(6f, 14f)
            horizontalLineTo(9f)
            verticalLineTo(11.02f)
            horizontalLineTo(6f)
            verticalLineTo(14f)
            close()
            moveToRelative(5f, 0f)
            horizontalLineToRelative(7f)
            verticalLineTo(11.02f)
            horizontalLineTo(11f)
            verticalLineTo(14f)
            close()
            moveTo(7.3f, 9.02f)
            horizontalLineToRelative(9.4f)
            lineTo(12f, 5.5f)
            lineTo(7.3f, 9.02f)
            close()
          }
        }
        .build()
    return _NestMultiRoom!!
  }

private var _NestMultiRoom: ImageVector? = null
