package com.example.composetest.feature.guns.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composetest.data.api.guns.GunModel
import com.example.composetest.ui.theme.mainFontFamily

@Composable
fun TitleAndImage(gun:GunModel){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
    ){
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = gun.displayName, fontFamily = mainFontFamily,color = Color.White, style = TextStyle(
            fontSize = 22.sp,
        ))
        GunImage(gun.displayIcon)

    }
}