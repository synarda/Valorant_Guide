package com.example.composetest.feature.home.components

import BlurredImage
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composetest.ui.theme.mainFontFamily

@Composable
fun HomePageCenterBox( text :String,imgPath:Int,navController: NavController, route:String){
    Box(
        modifier= Modifier
            .size(200.dp, 200.dp)
            .padding(horizontal = 8.dp)
            .clip(shape = RoundedCornerShape(40.dp)).clickable {
                navController.navigate(route)
            },
        contentAlignment = Alignment.Center
    ){

        BlurredImage(imgPath)
        Text(text = text, fontFamily = mainFontFamily,color = Color.White, style = TextStyle(
            fontSize = 25.sp,
        )
        )
    }
}