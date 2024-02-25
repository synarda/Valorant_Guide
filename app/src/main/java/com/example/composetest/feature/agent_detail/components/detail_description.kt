package com.example.composetest.feature.agent_detail.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetest.R
import com.example.composetest.ui.theme.mainFontFamily

@Composable
fun AgentDetailDescription(description:String){
    Box(
        modifier = Modifier. border(width = 0.5.dp, color = colorResource(id = R.color.mainColor03), shape = RoundedCornerShape(20.dp)) .shadow(
        elevation = 100.dp,
        spotColor = Color.Black,
        shape = RoundedCornerShape(8.dp)
    ).padding(all = 16.dp)
    ){
        Text(
            text = description,
            fontFamily = mainFontFamily,
            color = Color.White,
            style = TextStyle(fontSize = 16.sp, textAlign = TextAlign.Start)
        )
    }

}