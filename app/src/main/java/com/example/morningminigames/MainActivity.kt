package com.example.morningminigames

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.compose.snippets.components.NavigationBarExample
import com.example.morningminigames.ui.theme.MorningMinigamesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MorningMinigamesTheme() {
                NavigationBarExample()
            }
        }
    }
}