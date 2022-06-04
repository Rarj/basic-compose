package dev.arj.practicecomposebasic.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.arj.practicecomposebasic.ui.theme.PracticeComposeBasicTheme

class QuadrantActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeComposeBasicTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    QuadrantCompose()
                }
            }
        }
    }
}

@Composable
fun ContentQuadrantCompose(
    modifier: Modifier,
    title: String,
    subtitle: String,
) {
    Column(
        modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = subtitle,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun QuadrantCompose() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f, true)
        ) {
            ContentQuadrantCompose(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f, true)
                    .background(Color.Green)
                    .padding(16.dp),
                title = "Text Composable",
                subtitle = "Displays text and follows Material Design guidelines."
            )

            ContentQuadrantCompose(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f, true)
                    .background(Color.Yellow)
                    .padding(16.dp),
                title = "Image composable",
                subtitle = "Creates a composable that lays out and draws a given Painter class object."
            )

        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f, true)
        ) {
            ContentQuadrantCompose(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f, true)
                    .background(Color.Cyan)
                    .padding(16.dp),
                title = "Row composable",
                subtitle = "A layout composable that places its children in a horizontal sequence."
            )

            ContentQuadrantCompose(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f, true)
                    .background(Color.LightGray)
                    .padding(16.dp),
                title = "Column composable",
                subtitle = "A layout composable that places its children in a vertical sequence."
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    PracticeComposeBasicTheme {
        QuadrantCompose()
    }
}