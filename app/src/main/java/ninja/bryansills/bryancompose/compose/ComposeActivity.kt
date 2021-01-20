package ninja.bryansills.bryancompose.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.setContent
import ninja.bryansills.bryancompose.compose.ui.BryanTheme

class ComposeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { Body() }
    }
}

@Composable
fun Body() {
    BryanTheme {
        var count by mutableStateOf(10)
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
            Button(onClick = { count += 1 }) { Text(text = "THIS IS A BUTTON") }
            CountButton(count = count) { count += 1 }
        }
    }
}

@Composable
fun CountButton(count: Int, onClick: () -> Unit) {
    Button(onClick = onClick) { Text(text = "THE COUNT IS $count") }
}
