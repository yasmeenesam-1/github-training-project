package com.example.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = BrandPrimaryDark,
    onPrimary = BrandOnSurface,
    primaryContainer = BrandPrimary,
    onPrimaryContainer = BrandOnPrimary,
    secondary = BrandSecondaryDark,
    tertiary = BrandTertiaryDark,
    background = BrandBackgroundDark,
    surface = BrandSurfaceDark,
    surfaceVariant = BrandSurfaceVariantDark,
    onSurface = BrandOnSurfaceDark,
    onSurfaceVariant = BrandOnSurfaceVariantDark
)

private val LightColorScheme = lightColorScheme(
    primary = BrandPrimary,
    onPrimary = BrandOnPrimary,
    primaryContainer = BrandPrimaryContainer,
    onPrimaryContainer = BrandOnPrimaryContainer,
    secondary = BrandSecondary,
    tertiary = BrandTertiary,
    background = BrandBackground,
    surface = BrandSurface,
    surfaceVariant = BrandSurfaceVariant,
    onSurface = BrandOnSurface,
    onSurfaceVariant = BrandOnSurfaceVariant
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
