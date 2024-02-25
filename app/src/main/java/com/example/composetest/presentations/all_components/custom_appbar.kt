package com.example.composetest.presentations.all_components


import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composetest.R
import com.example.composetest.ui.theme.mainFontFamily

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CustomAppbar(title:String,navController:NavController){
    TopAppBar(
        backgroundColor = Color.Transparent,
        elevation = 0.dp,
        content = {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                IconButton(onClick = {navController.navigateUp()}) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                }
                Spacer(modifier = Modifier.weight(3f))
                Text(
                    text =title ,
                    fontFamily = mainFontFamily,
                    color = Color.White,
                    style = TextStyle( fontSize = 26.sp)
                )
                Spacer(modifier = Modifier.weight(4f))
            }
        },
    )
}