package com.example.composetest.presentations.utils



sealed class Screen(val route:String ){
    object WelcomeScreen : Screen(NavigateEnum.WelcomeScreen.name)
    object HomeScreen : Screen(NavigateEnum.HomeScreen.name)
    object AgentsScreen : Screen(NavigateEnum.AgentScreen.name)
    object GunsScreen : Screen(NavigateEnum.GunsScreen.name)
    object AgentDetailScreen : Screen(NavigateEnum.AgentDetail.name)

}


enum class NavigateEnum {
    WelcomeScreen,
    HomeScreen,
    AgentScreen,
    GunsScreen,
    AgentDetail
}
