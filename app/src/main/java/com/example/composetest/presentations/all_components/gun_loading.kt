package com.example.composetest.presentations.all_components
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.composetest.R

@Composable
fun GunLoading(){
    val compositionResult = rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.gun_loading))
    val composition by compositionResult

    composition?.let {
        Box(modifier = Modifier.size(200.dp).graphicsLayer(rotationZ = 270.0F)) {
            LottieAnimation(composition = it, iterations = LottieConstants.IterateForever )

        }
    }
}