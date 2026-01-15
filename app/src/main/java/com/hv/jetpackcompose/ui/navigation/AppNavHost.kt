package com.hv.jetpackcompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.hv.jetpackcompose.ui.screens.DetailsScreen
import com.hv.jetpackcompose.ui.screens.HomeScreen
import com.hv.jetpackcompose.ui.screens.ProfileScreen
import com.hv.jetpackcompose.ui.screens.SettingsScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Route.Home.route
    ) {
        // 主页
        composable(Route.Home.route) {
            HomeScreen(
                onNavigateToProfile = {
                    navController.navigate(Route.Profile.route)
                },
                onNavigateToSettings = {
                    navController.navigate(Route.Settings.route)
                }
            )
        }
        // 个人资料页
        composable(Route.Profile.route) {
            ProfileScreen(
                onNavigateBack = { navController.navigateUp() },
                onNavigateToDetails = {id ->
                    navController.navigate(Route.Detail.createRoute(id))
                }
            )
        }
        // 设置页
        composable(Route.Settings.route) {
            SettingsScreen(
                onNavigateBack = { navController.navigateUp() }
            )
        }
        // 详情页
        composable(
            route = Route.Detail.route,
            arguments = listOf(
                navArgument("id") {
                    type = NavType.StringType
                    nullable = false
                }
            )
        ) {backStackEntry ->
            val id = backStackEntry.arguments?.getString("id") ?: ""
            DetailsScreen(
                id = id,
                onNavigateBack = { navController.navigateUp() }
            )
        }
    }
}