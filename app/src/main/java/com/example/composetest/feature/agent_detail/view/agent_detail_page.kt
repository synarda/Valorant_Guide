package com.example.composetest.feature.agent_detail.view

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composetest.R
import com.example.composetest.data.api.agents.AgentsItemModel
import com.example.composetest.feature.agent_detail.components.AgentDetailBackGroundImage
import com.example.composetest.feature.agent_detail.components.AgentDetailBustPortrait
import com.example.composetest.feature.agent_detail.components.AgentDetailColors
import com.example.composetest.feature.agent_detail.components.AgentDetailDescription
import com.example.composetest.presentations.all_components.CustomAppbar
import com.example.composetest.presentations.all_components.OffsetRightLeft
import com.example.composetest.ui.theme.mainFontFamily

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AgentDetailPage(navController: NavController,agent:AgentsItemModel?) {
    Scaffold(
        topBar = {
            CustomAppbar(agent?.displayName?:"",navController)
        },
        content = {
            Box(
                modifier = Modifier
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
                    .fillMaxSize()
                    .padding(all = 12.dp),
                contentAlignment = Alignment.Center,
            ){
                Column(
                    verticalArrangement = Arrangement.Top
                ){
                    Row(){
                       OffsetRightLeft(field = { AgentDetailBustPortrait(img = agent?.bustPortrait ?:"") }, isToLeft =true )
                       OffsetRightLeft(field = { AgentDetailBackGroundImage(img = agent?.background ?:"")}, isToLeft = false)
                    }
                    Spacer(modifier = Modifier.height(32.dp))
                    AgentDetailDescription(agent?.description?:"")
                    Spacer(modifier = Modifier.height(32.dp))
                    (agent?.backgroundGradientColors?:null)?.let { it1 -> AgentDetailColors(it1) }
                }

            }
        }
    )
}

