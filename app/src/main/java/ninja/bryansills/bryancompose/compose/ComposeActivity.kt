package ninja.bryansills.bryancompose.compose

import android.app.Activity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.composer // You need to import this manually
import androidx.compose.setContent
import androidx.ui.core.CraneWrapper
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.layout.Column
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.Padding

class ComposeActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { BryanApp() }
    }
}

@Composable
fun BryanApp() {
    CraneWrapper {
        BryanBody()
    }
}

@Composable
fun BryanBody() {
    Padding(padding = 16.dp) {
        Column {
            Text(text = "This is my first test")
            HeightSpacer(height = 10.dp)
            Text(text = "This is more text after a spacer")
            HeightSpacer(height = 10.dp)
            Text(text = "Just more text")
        }
    }
}