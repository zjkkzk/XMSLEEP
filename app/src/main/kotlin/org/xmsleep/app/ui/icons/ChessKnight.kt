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
val ChessKnight: ImageVector
  get() {
    if (_ChessKnight != null) {
      return _ChessKnight!!
    }
    _ChessKnight =
      ImageVector.Builder(
          name = "chess_knight",
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
            moveTo(5f, 22f)
            verticalLineTo(18f)
            quadTo(5f, 17.43f, 5.3f, 16.96f)
            reflectiveQuadTo(6.1f, 16.23f)
            lineTo(11f, 13.75f)
            verticalLineTo(12f)
            lineTo(7.53f, 13.73f)
            quadTo(7.23f, 13.88f, 6.9f, 13.95f)
            reflectiveQuadTo(6.25f, 14.02f)
            quadToRelative(-0.77f, 0f, -1.46f, -0.4f)
            reflectiveQuadTo(3.73f, 12.48f)
            quadTo(3.38f, 11.8f, 3.43f, 11.04f)
            quadTo(3.48f, 10.27f, 3.9f, 9.63f)
            lineTo(7f, 5f)
            lineTo(5f, 2f)
            horizontalLineToRelative(6f)
            quadToRelative(3.33f, 0f, 5.66f, 2.32f)
            reflectiveQuadTo(19f, 10f)
            verticalLineTo(22f)
            horizontalLineTo(5f)
            close()
            moveTo(7f, 20f)
            horizontalLineTo(17f)
            verticalLineTo(10f)
            quadTo(17f, 7.5f, 15.25f, 5.75f)
            reflectiveQuadTo(11f, 4f)
            horizontalLineTo(8.75f)
            lineTo(9.4f, 5f)
            lineTo(5.58f, 10.75f)
            quadToRelative(-0.13f, 0.2f, -0.14f, 0.41f)
            reflectiveQuadToRelative(0.09f, 0.41f)
            quadToRelative(0.13f, 0.28f, 0.34f, 0.36f)
            quadToRelative(0.21f, 0.09f, 0.41f, 0.09f)
            quadToRelative(0.08f, 0f, 0.38f, -0.07f)
            lineTo(13f, 8.75f)
            verticalLineTo(15f)
            lineTo(7f, 18f)
            verticalLineToRelative(2f)
            close()
            moveTo(4f, -8f)
            close()
          }
        }
        .build()
    return _ChessKnight!!
  }

private var _ChessKnight: ImageVector? = null
