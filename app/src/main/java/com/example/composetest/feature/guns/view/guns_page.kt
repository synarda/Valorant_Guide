package com.example.composetest.feature.guns.view

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.composetest.R
import com.example.composetest.feature.agents.components.AgentListItemShimmer
import com.example.composetest.feature.agents.components.AgentsListItem
import com.example.composetest.feature.guns.components.GunsListItem
import com.example.composetest.feature.guns.view_models.GunsViewModel
import com.example.composetest.presentations.all_components.CustomAppbar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GunsPage(navController : NavController){
    val viewModel:GunsViewModel= viewModel()
    val guns =viewModel.gunsList.observeAsState(initial = emptyList())
    LaunchedEffect(key1 = true){
        viewModel.fetchGuns()
    }
    Scaffold(
        topBar = {
            CustomAppbar(stringResource(id = R.string.game_name),navController)
        },
        content = {
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
                Column(
                    verticalArrangement = Arrangement.Center
                ){
                    Spacer(modifier = Modifier.height(48.dp))
                    if(viewModel.gunsList!=null&&viewModel.isLoading){
                        LazyColumn {
                            items(guns.value) { gun ->
                                GunsListItem(gun)
                            }
                        }
                    }else{
                        LazyColumn {
                            items(16) { agent ->
                                AgentListItemShimmer()
                            }
                        }
                    }
                }
            }
        }
    )
}