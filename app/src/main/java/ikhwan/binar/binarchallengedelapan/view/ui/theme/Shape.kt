package ikhwan.binar.binarchallengedelapan.view.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(0.dp)
)

val TopOnlyCorner = Shapes(
    medium = RoundedCornerShape(
        topStart = 30.dp,
        topEnd = 30.dp
    )
)

val BottomOnlyCorner = Shapes(
    medium = RoundedCornerShape(
        bottomStart = 30.dp,
        bottomEnd = 30.dp
    )
)