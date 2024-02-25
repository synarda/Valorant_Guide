package com.example.composetest.feature.welcome
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composetest.R
import com.example.composetest.presentations.utils.Screen
import com.example.composetest.ui.theme.mainFontFamily



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WelcomePage(navController: NavController) {
    Scaffold(
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
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
                    .pointerInput(Unit) {
                        detectTapGestures(onPress = {
                            navController.navigate(Screen.HomeScreen.route)
                        })
                    },
                contentAlignment = Alignment.Center
            ) {
                val image: Painter = painterResource(id = R.drawable.valorant_logo)
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.size(300.dp))
                    Image(painter = image, contentDescription = "valorant_logo", Modifier.size(200.dp))
                    Text(text = stringResource(id = R.string.welcome_text), fontFamily = mainFontFamily, color = colorResource(id = R.color.textColor))
                    Spacer(modifier = Modifier.size(300.dp))
                    Text(text = stringResource(id = R.string.touch_anybody), fontFamily = mainFontFamily, color = colorResource(id = R.color.textColor))
                }
            }
        }
    )
}