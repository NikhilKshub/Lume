package com.nikhi.lume.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LumeColorScheme = darkColorScheme(
    primary = SoftViolet,
    onPrimary = VioletInk,
    secondary = LumeTextSecondary,
    onSecondary = LumeBlack,
    background = LumeBlack,
    onBackground = LumeText,
    surface = LumeSurface,
    onSurface = LumeText,
    surfaceVariant = LumeSurface,
    onSurfaceVariant = LumeTextSecondary,
    outline = Color(0xFF4A4950),
)

@Composable
fun LumeTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LumeColorScheme,
        typography = LumeTypography,
        shapes = LumeShapes,
        content = content,
    )
}
