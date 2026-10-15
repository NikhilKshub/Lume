package com.nikhi.lume

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.nikhi.lume.ui.LumeApp
import com.nikhi.lume.ui.theme.LumeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LumeTheme {
                LumeApp()
            }
        }
    }
}
