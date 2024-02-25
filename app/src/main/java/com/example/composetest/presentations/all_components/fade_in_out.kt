package com.example.composetest.presentations.all_components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun FadeInAndOut(field: @Composable () -> Unit) {
    val alpha = remember { Animatable(initialValue = 0f) }

    LaunchedEffect(true) {
        alpha.animateTo(
            targetValue = 1f,
            animationSpec = tween(durationMillis = 2000)
        )
        alpha.animateTo(
            targetValue = 1f,
            animationSpec = tween(durationMillis = 1000)
        )
    }
    Box(
        modifier = Modifier.fillMaxSize()
            .graphicsLayer(alpha = alpha.value),
        contentAlignment = Alignment.CenterStart
    )  {
        field()
    }
}
