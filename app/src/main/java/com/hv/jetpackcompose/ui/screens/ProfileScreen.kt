package com.hv.jetpackcompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen(
    onNavigateBack: () -> Unit,
    onNavigateToDetails: (String) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("个人资料")
        Button(onClick = onNavigateBack) {
            Text("返回主页")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { onNavigateToDetails("user_123") }) {
            Text("查看详情(ID:user_123)")
        }
    }
}