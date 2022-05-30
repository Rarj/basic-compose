package dev.arj.practicecomposebasic.article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.arj.practicecomposebasic.R
import dev.arj.practicecomposebasic.ui.theme.PracticeComposeBasicTheme

class ArticleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeComposeBasicTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArticleCompose()
                }
            }
        }
    }
}

@Composable
fun ArticleCompose() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        val painter = painterResource(id = R.drawable.bg_compose_background)

        Image(painter = painter, contentDescription = null, modifier = Modifier.fillMaxWidth())

        TextCompose(
            value = "Jetpack Compose tutorial",
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp),
            fontSize = 24.sp
        )

        TextCompose(
            value = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )

        TextCompose(
            value = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
private fun TextCompose(
    value: String,
    modifier: Modifier,
    textAlign: TextAlign? = null,
    fontSize: TextUnit = TextUnit.Unspecified
) {
    Text(
        text = value,
        textAlign = textAlign,
        fontSize = fontSize,
        modifier = modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    PracticeComposeBasicTheme {
        ArticleCompose()
    }
}