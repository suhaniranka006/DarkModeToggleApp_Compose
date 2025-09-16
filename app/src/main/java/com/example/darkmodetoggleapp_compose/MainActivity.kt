package com.example.darkmodetoggleapp_compose

import android.R.style.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.darkmodetoggleapp_compose.ui.theme.DarkModeToggleApp_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DarkModeToggleApp()

        }
    }
}

@Composable
fun DarkModeToggleApp() {
    var isDark by remember { mutableStateOf(false) }

    // Use the default theme generated in Theme.kt
    DarkModeToggleApp_ComposeTheme(darkTheme = isDark) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(100.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Enable Dark Mode", style = MaterialTheme.typography.bodyLarge)
                Switch(
                    checked = isDark,
                    onCheckedChange = { isDark = it }
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {}) {
                Text("Styled Button", style = MaterialTheme.typography.titleLarge)
            }
        }
    }
}
