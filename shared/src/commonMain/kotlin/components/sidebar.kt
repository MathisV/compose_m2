import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

// A component that displays a sidebar with a list of items
@Composable()
internal fun sidebar(items: List<String>, image: Painter) {
    Image(painter = image, contentDescription = "My photo")
    items.forEach { item ->
        Text(text = item, modifier = Modifier.fillMaxWidth().padding(top = 8.dp), textAlign = TextAlign.Center)
    }
}