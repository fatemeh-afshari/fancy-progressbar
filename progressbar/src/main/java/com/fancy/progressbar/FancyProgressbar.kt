package com.fancy.progressbar

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun FancyProgressbar(
    initialValue: Float, // 0 to maxValue
    targetValue: Float, // 0 to maxValue
    trackColor: Color = Color(0xFFBFBFC0),
    indicatorColor: Brush = Brush.horizontalGradient(
        tileMode = TileMode.Clamp,
        colors = listOf(
            Color(0xFFE91E63),
            Color(0xFFF48FB1),
        )
    ),
    shadowColor: Color = Color(0xFF7E57C2),
    radius: Dp = 16.dp,
    height: Dp = 16.dp,
    animationDuration: Int = 3000,
    maxValue: Float = 100f,
) {

    val progress = remember { Animatable(initialValue / maxValue) }

    LaunchedEffect(Unit) {
        progress.animateTo(
            targetValue / maxValue,
            animationSpec = tween(animationDuration),
        )
    }

    Box(
        contentAlignment = Alignment.CenterStart,
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .background(color = Color.Transparent)


    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(height)
                .clip(RoundedCornerShape(radius))
                .background(color = trackColor),
        )
        Box(
            modifier = Modifier
                .fillMaxWidth(progress.value)
                .height(height)
                .advanceShadow(color = shadowColor)
                .clip(RoundedCornerShape(radius))
                .background(brush = indicatorColor)
        )
    }

}
