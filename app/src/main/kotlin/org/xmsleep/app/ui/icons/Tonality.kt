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
val Tonality: ImageVector
  get() {
    if (_Tonality != null) {
      return _Tonality!!
    }
    _Tonality =
      ImageVector.Builder(
          name = "tonality",
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
            moveTo(8.1f, 21.21f)
            quadTo(6.28f, 20.43f, 4.93f, 19.08f)
            quadTo(3.58f, 17.73f, 2.79f, 15.9f)
            reflectiveQuadTo(2f, 12f)
            quadTo(2f, 9.92f, 2.79f, 8.1f)
            quadTo(3.58f, 6.27f, 4.93f, 4.93f)
            quadTo(6.28f, 3.57f, 8.1f, 2.79f)
            quadTo(9.93f, 2f, 12f, 2f)
            reflectiveQuadToRelative(3.9f, 0.79f)
            reflectiveQuadToRelative(3.17f, 2.14f)
            quadToRelative(1.35f, 1.35f, 2.14f, 3.17f)
            quadTo(22f, 9.92f, 22f, 12f)
            reflectiveQuadToRelative(-0.79f, 3.9f)
            reflectiveQuadToRelative(-2.14f, 3.17f)
            quadToRelative(-1.35f, 1.35f, -3.17f, 2.14f)
            reflectiveQuadTo(12f, 22f)
            quadTo(9.93f, 22f, 8.1f, 21.21f)
            close()
            moveTo(11f, 19.95f)
            verticalLineTo(4.05f)
            quadTo(7.98f, 4.42f, 5.99f, 6.7f)
            reflectiveQuadTo(4f, 12f)
            reflectiveQuadToRelative(1.99f, 5.3f)
            reflectiveQuadTo(11f, 19.95f)
            close()
            moveToRelative(2f, 0f)
            quadToRelative(0.75f, -0.13f, 1.48f, -0.34f)
            reflectiveQuadTo(15.85f, 19f)
            horizontalLineTo(13f)
            verticalLineToRelative(0.95f)
            close()
            moveTo(13f, 17f)
            horizontalLineToRelative(5.25f)
            quadToRelative(0.2f, -0.23f, 0.35f, -0.48f)
            reflectiveQuadTo(18.9f, 16f)
            horizontalLineTo(13f)
            verticalLineToRelative(1f)
            close()
            moveToRelative(0f, -3f)
            horizontalLineToRelative(6.75f)
            quadToRelative(0.05f, -0.25f, 0.1f, -0.5f)
            reflectiveQuadTo(19.95f, 13f)
            horizontalLineTo(13f)
            verticalLineToRelative(1f)
            close()
            moveToRelative(0f, -3f)
            horizontalLineToRelative(6.95f)
            quadTo(19.9f, 10.75f, 19.85f, 10.5f)
            reflectiveQuadTo(19.75f, 10f)
            horizontalLineTo(13f)
            verticalLineToRelative(1f)
            close()
            moveTo(13f, 8f)
            horizontalLineToRelative(5.9f)
            quadTo(18.75f, 7.72f, 18.6f, 7.47f)
            reflectiveQuadTo(18.25f, 7f)
            horizontalLineTo(13f)
            verticalLineTo(8f)
            close()
            moveTo(13f, 5f)
            horizontalLineToRelative(2.85f)
            quadTo(15.2f, 4.6f, 14.48f, 4.39f)
            quadTo(13.75f, 4.17f, 13f, 4.05f)
            verticalLineTo(5f)
            close()
            moveToRelative(-2f, 7f)
            close()
          }
        }
        .build()
    return _Tonality!!
  }

private var _Tonality: ImageVector? = null
