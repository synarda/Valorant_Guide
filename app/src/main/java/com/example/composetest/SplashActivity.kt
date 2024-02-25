package com.example.composetest

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.composetest.feature.splash.SplashPage
import com.example.composetest.ui.theme.ComposeTestTheme



@SuppressLint("CustomSplashScreen")
class SplashActivity:ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor=getColor(R.color.mainColor03)
        setContent {
            SplashPage(onSplashFinished = {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            })
        }
    }
}