package com.example.composetest.feature.agent_detail.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun AgentDetailBackGroundImage(img:String){
    Box(
        contentAlignment = Alignment.CenterStart
    ){
        Image(
            painter = rememberAsyncImagePainter(img),
            contentDescription = null,
            modifier = Modifier.size(250.dp,300.dp),
            contentScale = ContentScale.Crop,
        )
    }
}