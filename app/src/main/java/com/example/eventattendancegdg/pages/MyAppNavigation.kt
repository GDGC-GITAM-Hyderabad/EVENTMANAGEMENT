package com.example.eventattendancegdg.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.eventattendancegdg.AuthViewModel
import com.example.eventattendancegdg.EventViewModel

@Composable
fun MyAppNavigation(
    modifier: Modifier = Modifier,
    authViewModel: AuthViewModel
) {
    val navController = rememberNavController()
    val eventViewModel = remember { EventViewModel() }
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        // Login Page
        composable("login") {
            LoginPage(modifier, navController, authViewModel)
        }

        // Signup Page
        composable("signup") {
            SignupPage(modifier, navController, authViewModel)
        }

        // Home Page
        composable("home") {
            HomePage(
                modifier = modifier,
                navController = navController,
                authViewModel = authViewModel,
                eventViewModel = eventViewModel
            )
        }

        // Add Event Page
        composable("add_event") {
            AddEventPage(
                navController = navController,
                onEventAdded = eventViewModel::addEvent
            )
        }

        // Account Page
        composable("account") {
            AccountPage(
                authViewModel = authViewModel,
                navController = navController
            )
        }


    }
}
