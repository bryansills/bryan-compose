package ninja.bryansills.bryancompose.compose

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.compose.Composable
import androidx.compose.composer // You need to import this manually
import androidx.compose.setContent
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.CraneWrapper
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.sp
import androidx.ui.layout.Column
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.Padding
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle

class ComposeActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { BryanApp() }
    }
}

@Composable
fun BryanApp() {
    CraneWrapper {
        MaterialTheme {
            BryanBody()
        }
    }
}

@Composable
fun BryanBody() {
    val count = +state { 0 }
    Padding(padding = 16.dp) {
        Column {
            Text(
                text = "This is my first test",
                style = +themeTextStyle { body1 }
            )
            HeightSpacer(height = 10.dp)
            Text(
                text = "This is more text after a spacer",
                style = +themeTextStyle { body2 }
            )
            HeightSpacer(height = 10.dp)
            Text(
                text = "This is the current count: ${count.value}",
                style = +themeTextStyle { body2 }
            )
            Button(
                text = "THIS IS A BUTTON",
                onClick = { count.value += 1 }
            )
        }
    }
}