package com.hv.jetpackcompose.ui.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun HomeScreen(
    onNavigateToProfile: () -> Unit,
    onNavigateToSettings: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("主页")
        Button(onClick = onNavigateToProfile) {
            Text("去个人资料")
        }
        Button(onClick = onNavigateToSettings) {
            Text("去设置")
        }
    }
}