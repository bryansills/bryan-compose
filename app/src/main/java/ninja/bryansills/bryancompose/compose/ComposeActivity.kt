package ninja.bryansills.bryancompose.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TextButton

class ComposeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { Body() }
    }
}

@Composable
fun Body() {
    MaterialTheme {
        var count by state { 10 }
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
            TextButton(onClick = { count += 1 }) { Text(text = "THIS IS A BUTTON") }
        }
    }
}
