package com.example.composetest

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composetest.presentations.utils.Navigation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor=getColor(R.color.mainColor03)
        setContent {
           Surface() {
               MyApp()
           }
        }
    }
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyApp() {
    Navigation()
}


@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
        MyApp()
}


