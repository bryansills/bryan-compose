package ninja.bryansills.bryancompose.compose

import android.app.Activity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme

class ComposeActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { BryanApp() }
    }
}

@Composable
fun BryanApp() {
        MaterialTheme {
            BryanBody()
        }
}

@Composable
fun BryanBody() {
    var count by state { 0 }
        Column {
            Text(
                text = "This is my first test",
                style = MaterialTheme.typography.body1
            )
            Text(
                text = "This is more text after a spacer",
                style = MaterialTheme.typography.body2
            )
            Text(
                text = "This is the current count: $count",
                style = MaterialTheme.typography.body2
            )
            Button(
                onClick = { count += 1 }
            ) { Text(text = "THIS IS A BUTTON WITH COUNT: $count") }
        }
}
