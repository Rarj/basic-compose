package dev.arj.businesscardcompose.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import dev.arj.businesscardcompose.R
import dev.arj.businesscardcompose.utils.showBrowser
import dev.arj.businesscardcompose.utils.showLinkedIn

@Composable
fun FooterCompose() {
    val localContext = LocalContext.current
    Row {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom
        ) {
            ItemContact(R.drawable.ic_github, "Rarj") {
                val githubUrl = "https://github.com/rarj"
                showBrowser(localContext, githubUrl)
            }
            ItemContact(R.drawable.ic_linkedin, "Rio Arjuna") {
                showLinkedIn(localContext)
            }
        }
    }
}