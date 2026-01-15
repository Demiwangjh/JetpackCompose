package com.hv.jetpackcompose.ui

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.hv.jetpackcompose.ui.navigation.AppNavHost
import com.hv.jetpackcompose.ui.theme.JetpackComposeTheme

@Composable
fun MainApp() {
    JetpackComposeTheme {
        Surface {
            AppNavHost()
        }
    }
}