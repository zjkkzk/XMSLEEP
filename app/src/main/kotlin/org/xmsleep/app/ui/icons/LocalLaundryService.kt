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
val LocalLaundryService: ImageVector
  get() {
    if (_LocalLaundryService != null) {
      return _LocalLaundryService!!
    }
    _LocalLaundryService =
      ImageVector.Builder(
          name = "local_laundry_service",
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
            moveTo(6f, 22f)
            quadTo(5.18f, 22f, 4.59f, 21.41f)
            reflectiveQuadTo(4f, 20f)
            verticalLineTo(4f)
            quadTo(4f, 3.17f, 4.59f, 2.59f)
            reflectiveQuadTo(6f, 2f)
            horizontalLineTo(18f)
            quadToRelative(0.82f, 0f, 1.41f, 0.59f)
            reflectiveQuadTo(20f, 4f)
            verticalLineTo(20f)
            quadToRelative(0f, 0.82f, -0.59f, 1.41f)
            reflectiveQuadTo(18f, 22f)
            horizontalLineTo(6f)
            close()
            moveTo(6f, 20f)
            horizontalLineTo(18f)
            verticalLineTo(4f)
            horizontalLineTo(6f)
            verticalLineTo(20f)
            close()
            moveToRelative(9.54f, -2.46f)
            quadTo(17f, 16.08f, 17f, 14f)
            reflectiveQuadTo(15.54f, 10.46f)
            reflectiveQuadTo(12f, 9f)
            quadTo(9.93f, 9f, 8.46f, 10.46f)
            quadTo(7f, 11.93f, 7f, 14f)
            reflectiveQuadToRelative(1.46f, 3.54f)
            reflectiveQuadTo(12f, 19f)
            reflectiveQuadToRelative(3.54f, -1.46f)
            close()
            moveTo(12f, 17.3f)
            quadToRelative(-0.65f, 0f, -1.26f, -0.24f)
            reflectiveQuadTo(9.65f, 16.35f)
            lineToRelative(4.7f, -4.7f)
            quadToRelative(0.47f, 0.48f, 0.71f, 1.09f)
            reflectiveQuadTo(15.3f, 14f)
            quadToRelative(0f, 1.38f, -0.96f, 2.34f)
            reflectiveQuadTo(12f, 17.3f)
            close()
            moveTo(8f, 7f)
            quadTo(8.43f, 7f, 8.71f, 6.71f)
            quadTo(9f, 6.43f, 9f, 6f)
            reflectiveQuadTo(8.71f, 5.29f)
            reflectiveQuadTo(8f, 5f)
            quadTo(7.58f, 5f, 7.29f, 5.29f)
            reflectiveQuadTo(7f, 6f)
            reflectiveQuadTo(7.29f, 6.71f)
            reflectiveQuadTo(8f, 7f)
            close()
            moveTo(11.71f, 6.71f)
            quadTo(12f, 6.43f, 12f, 6f)
            reflectiveQuadTo(11.71f, 5.29f)
            reflectiveQuadTo(11f, 5f)
            reflectiveQuadTo(10.29f, 5.29f)
            reflectiveQuadTo(10f, 6f)
            reflectiveQuadToRelative(0.29f, 0.71f)
            reflectiveQuadTo(11f, 7f)
            reflectiveQuadTo(11.71f, 6.71f)
            close()
            moveTo(6f, 20f)
            verticalLineTo(4f)
            verticalLineTo(20f)
            close()
          }
        }
        .build()
    return _LocalLaundryService!!
  }

private var _LocalLaundryService: ImageVector? = null
