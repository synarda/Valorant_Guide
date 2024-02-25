package com.example.composetest.feature.agents.components

import AgentsViewModel
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.composetest.R
import com.example.composetest.data.api.agents.AgentsItemModel
import com.example.composetest.presentations.all_components.FadeInAndOut
import com.example.composetest.ui.theme.mainFontFamily

@Composable
fun AgentsListItem(agent: AgentsItemModel,navController: NavController){
    val viewModelAgents=AgentsViewModel()
    Box(
        modifier = Modifier
            .fillMaxWidth().height(130.dp).padding( start = 16.dp, end = 16.dp).clickable {
                    viewModelAgents.selectAgent(agent, navController)
            },
        contentAlignment = Alignment.BottomStart,
        ){
        Box(
            modifier = Modifier
                .fillMaxWidth().height(85.dp).clip(shape = RoundedCornerShape(20.dp))
                .background(
                    color = colorResource(
                        id = R.color.mainColor03
                    )
                ),
            contentAlignment = Alignment.Center,
        ){
            Text(text = agent.displayName,fontFamily = mainFontFamily, style = TextStyle(fontSize = 20.sp,color = Color.White))
        }
        Box(
            modifier=Modifier.clip(shape = RoundedCornerShape(10.dp)), contentAlignment = Alignment.CenterStart
        ){

            FadeInAndOut(field = {
                Image(
                    painter = rememberAsyncImagePainter(agent.bustPortrait),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp,250.dp),
                    contentScale = ContentScale.Crop,
                )
            })

        }
    }

}



