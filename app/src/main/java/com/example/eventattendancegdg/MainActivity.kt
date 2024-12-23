package com.example.eventattendancegdg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.eventattendancegdg.pages.MyAppNavigation
import com.example.eventattendancegdg.ui.theme.EVENTATTENDANCEGDGTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Proper call to the superclass method

        // Create an instance of AuthViewModel
        val authViewModel: AuthViewModel by viewModels()

        // Set up the main content of the app
        setContent {
            EVENTATTENDANCEGDGTheme { // Apply the app's custom theme
                Scaffold(
                    modifier = Modifier.fillMaxSize(), // Ensure full-screen layout
                    content = { innerPadding ->
                        // Pass padding and ViewModel to the navigation
                        MyAppNavigation(
                            modifier = Modifier.padding(innerPadding),
                            authViewModel = authViewModel // Pass the ViewModel instance
                        )
                    }
                )
            }
        }
    }
}
