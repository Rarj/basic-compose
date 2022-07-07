package dev.arj.businesscardcompose.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.arj.businesscardcompose.ui.theme.Accent
import dev.arj.businesscardcompose.R

@Composable
fun HeaderCompose() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 48.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val painter = painterResource(id = R.drawable.android_logo)
        Image(
            painter = painter, contentDescription = "Android Logo",
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
        )
        Text(text = "Rio Arjuna", fontSize = 32.sp, color = Color.White)
        Text(text = "Android Developer", fontSize = 16.sp, color = Accent)
    }
}