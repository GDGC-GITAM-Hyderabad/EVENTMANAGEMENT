package com.example.eventattendancegdg.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

// Dark Color Scheme
private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF00C853), // Green for buttons and accents
    onPrimary = Color.White, // White text on primary
    background = Color(0xFF121212), // Dark background color
    onBackground = Color(0xFFE0E0E0), // Light gray text on dark background
    surface = Color(0xFF1E1E1E), // Slightly lighter dark for cards
    onSurface = Color(0xFFF5F5F5) // White text on cards
)

// Light Color Scheme
private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF6200EE), // Purple for primary actions
    onPrimary = Color.White, // White text on primary
    background = Color(0xFFFFFBFE), // Light background
    onBackground = Color(0xFF1C1B1F), // Dark text on light background
    surface = Color(0xFFFFFFFF), // White surface for cards
    onSurface = Color(0xFF1C1B1F) // Dark text on white surface
)

@Composable
fun EVENTATTENDANCEGDGTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    // Check if the system supports dynamic color and if it's enabled
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> getDarkColorScheme()
        else -> getLightColorScheme()
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography, // Assuming Typography is defined elsewhere
        content = content
    )
}
