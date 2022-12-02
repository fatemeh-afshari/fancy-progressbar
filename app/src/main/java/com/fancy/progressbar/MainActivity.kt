package com.fancy.progressbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fancy.progressbar.ui.theme.FancyProgressbarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FancyProgressbarTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    Box(modifier = Modifier.padding(horizontal = 16.dp, vertical = 32.dp)) {
                        FancyProgressbar(
                            initialValue = 0f, // 0 to maxValue
                            targetValue = 50f, // 0 to maxValue
                            trackColor = Color(0xFFBFBFC0),
                            indicatorColor = Brush.horizontalGradient(
                                tileMode = TileMode.Clamp,
                                colors = listOf(
                                    Color(0xFFE91E63),
                                    Color(0xFFF48FB1),
                                )
                            ),
                            shadowColor = Color(0xFF7E57C2),
                            radius = 16.dp,
                            height = 16.dp,
                            animationDuration = 3000,
                            maxValue = 100f,
                        )
                    }
                }
            }
        }
    }
}
