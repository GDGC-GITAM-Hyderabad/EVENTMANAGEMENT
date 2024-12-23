package com.example.eventattendancegdg.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme // Make sure this import is correct
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Define your custom colors
val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

// Dark color scheme
fun getDarkColorScheme() = darkColorScheme(
    primary = Color(0xFF00C853), // Green for buttons and cards
    onPrimary = Color.White, // White text on green
    secondary = Color(0xFF6200EA), // Purple for bottom bar icons
    onSecondary = Color.White, // White text on purple
    background = Color(0xFF121212), // Dark gray background
    surface = Color(0xFF1E1E1E), // Slightly lighter gray for cards or surfaces
    onBackground = Color(0xFFE0E0E0), // Light gray text on dark background
    onSurface = Color(0xFFF5F5F5) // White text on surfaces
)

// Light color scheme
fun getLightColorScheme() = lightColorScheme(
    primary = Color(0xFF00C853), // Green for buttons and cards
    onPrimary = Color.White, // White text on green
    secondary = Color(0xFF6200EA), // Purple for bottom bar icons
    onSecondary = Color.White, // White text on purple
    background = Color(0xFFFFFFFF), // White background
    surface = Color(0xFFF5F5F5), // Light gray for cards or surfaces
    onBackground = Color(0xFF1C1B1F), // Dark gray text on light background
    onSurface = Color(0xFF1C1B1F) // Dark gray text on surfaces
)

@Composable
fun EVENTATTENDANCEGDGTheme(
    darkTheme: Boolean = isSystemInDarkTheme(), // Make sure the correct import is used here
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) getDarkColorScheme() else getLightColorScheme()

    MaterialTheme(
        colorScheme = colorScheme,
        content = content // Removed Typography as it's undefined here
    )
}
