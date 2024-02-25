package com.example.composetest.presentations.utils
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composetest.data.api.agents.AgentsItemModel
import com.example.composetest.feature.agent_detail.view.AgentDetailPage
import com.example.composetest.feature.agents.view.AgentPage
import com.example.composetest.feature.guns.view.GunsPage
import com.example.composetest.feature.home.view.HomePage
import com.example.composetest.feature.welcome.WelcomePage


@Composable
   fun Navigation(){
       val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.WelcomeScreen.route) {
           composable(Screen.WelcomeScreen.route) {
               WelcomePage(navController)
           }
           composable(Screen.HomeScreen.route) {
               HomePage(navController)
           }
           composable(Screen.AgentsScreen.route) {
               AgentPage(navController)
           }
           composable(Screen.GunsScreen.route) {
               GunsPage(navController)
           }
        composable(Screen.AgentDetailScreen.route) {
           val agent = navController.previousBackStackEntry?.savedStateHandle?.get<AgentsItemModel>("AgentsItemModel")
            AgentDetailPage(navController = navController, agent = agent)
        }





    }
   }
