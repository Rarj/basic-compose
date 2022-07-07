package dev.arj.businesscardcompose.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
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
fun ItemContact(@DrawableRes icon: Int, text: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .clickable(enabled = true, onClick = onClick)
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            tint = Accent,
            modifier = Modifier
                .height(48.dp)
                .width(48.dp),
            painter = painterResource(id = icon), contentDescription = null
        )
        Text(
            text = text, fontSize = 24.sp, color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f, fill = true)
                .padding(start = 16.dp, end = 16.dp)
        )
        Icon(
            tint = Accent,
            modifier = Modifier
                .height(48.dp)
                .width(48.dp),
            painter = painterResource(id = R.drawable.ic_arrow_right), contentDescription = null
        )
    }
}