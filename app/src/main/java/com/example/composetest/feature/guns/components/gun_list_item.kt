package com.example.composetest.feature.guns.components

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.alpha
import coil.compose.rememberAsyncImagePainter
import com.example.composetest.R
import com.example.composetest.data.api.guns.GunModel
import com.example.composetest.presentations.all_components.FadeInAndOut
import java.lang.reflect.Modifier

@Composable
fun GunsListItem(gun:GunModel){
    Box(  modifier = androidx.compose.ui.Modifier.padding(all = 24.dp),
        contentAlignment = Alignment.Center
    ){
        Box(
            modifier = androidx.compose.ui.Modifier
                .clip(shape = RoundedCornerShape(40.dp))
                .background(
                    color = colorResource(id = R.color.mainColor03).copy(alpha = 0.5F)
                )
                .border(
                    width = 0.5.dp,
                    color = colorResource(id = R.color.mainColor02),
                    shape = RoundedCornerShape(40.dp)
                )
                .fillMaxSize()
                .height(200.dp),
            contentAlignment = Alignment.Center
        ){
            TitleAndImage(gun)
        }
    }
}


