package com.example.composetest.feature.guns.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.composetest.presentations.all_components.FadeInAndOut

@Composable
fun GunImage(img:String){
    Box(  modifier = Modifier.padding(horizontal = 32.dp),
        ){
        FadeInAndOut(field = {
            Image(
                painter = rememberAsyncImagePainter(img),
                contentDescription = null,
                modifier = Modifier
                    .size(400.dp,150.dp),
                contentScale = ContentScale.Fit
                ,
            )
        })
    }
}