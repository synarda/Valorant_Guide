package com.example.composetest.presentations.all_components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OffsetRightLeft(field:@Composable ()->Unit,isToLeft:Boolean){
    val animatableOffset = remember { Animatable(initialValue = 1f) }
    val offsetState = animateFloatAsState(
        targetValue = if(isToLeft){ -animatableOffset.value}else{animatableOffset.value} ,
        animationSpec = tween(durationMillis = 2000)
    )
    LaunchedEffect(true) {
        animatableOffset.animateTo(
            targetValue = 0f,
            animationSpec = tween(durationMillis = 0)
        )
    }
    Box(modifier = Modifier.offset(x = offsetState.value.dp*500 )){
        field()
    }
}