package dev.arj.businesscardcompose.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.arj.businesscardcompose.ui.component.FooterCompose
import dev.arj.businesscardcompose.ui.component.HeaderCompose
import dev.arj.businesscardcompose.ui.theme.Background

@Composable
fun BackgroundBusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        HeaderCompose()
        FooterCompose()
    }
}