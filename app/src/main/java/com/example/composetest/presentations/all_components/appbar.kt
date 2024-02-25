package com.example.composetest.presentations.all_components

import android.annotation.SuppressLint
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.composetest.R
import com.example.composetest.ui.theme.mainFontFamily

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultAppbar(titleId:Int){
    CenterAlignedTopAppBar(
        title = {
            Text(text = stringResource(id = titleId), style = TextStyle(fontSize = 50.sp),fontFamily = mainFontFamily, color = Color.White)
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Transparent)
    )
}