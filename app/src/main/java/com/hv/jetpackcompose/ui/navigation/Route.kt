package com.hv.jetpackcompose.ui.navigation

sealed class Route(val route: String) {
    object Home : Route("home")
    object Profile : Route("profile")
    object Settings : Route("settings")

    object Detail : Route("details/{id}") {
        fun createRoute(id: String) = "details/$id"
    }
}

// 路由辅助函数
object Routes {
    const val HOME = "home"
    const val PROFILE = "profile"
    const val SETTINGS = "settings"
    const val DETAILS = "details/{id}"
}