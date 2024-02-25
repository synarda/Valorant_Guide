package com.example.composetest.feature.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.colorResource
import com.example.composetest.R
import kotlinx.coroutines.delay

@Composable
 fun  SplashPage(onSplashFinished: () -> Unit){
    LaunchedEffect(key1 = true) {
        delay(3000)
        onSplashFinished()
    }
    Box(modifier = Modifier
        .background(
            brush = Brush.verticalGradient(
                colors = listOf(
                    colorResource(id = R.color.mainColor03),
                    colorResource(id = R.color.black)
                ),
                startY = 1f,
                endY = 1500f
            )
        )
        .fillMaxSize(),
        contentAlignment = Alignment.Center,
    ){

    }
}