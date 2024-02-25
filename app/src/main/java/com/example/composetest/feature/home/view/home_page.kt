package com.example.composetest.feature.home.view
import androidx.navigation.NavController
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.composetest.R
import com.example.composetest.feature.home.components.HomePageCenterBox
import com.example.composetest.presentations.all_components.DefaultAppbar
import com.example.composetest.ui.theme.mainFontFamily
import com.example.composetest.presentations.utils.Screen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(navController: NavController) {
    Scaffold(
        topBar = {
            DefaultAppbar( R.string.game_name)
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
                Row() {
                    HomePageCenterBox("Agents",R.drawable.valorant_agents,navController, Screen.AgentsScreen.route)
                    HomePageCenterBox("Guns",R.drawable.valorant_guns,navController, Screen.GunsScreen.route)
                }
            }
        }
    )
}