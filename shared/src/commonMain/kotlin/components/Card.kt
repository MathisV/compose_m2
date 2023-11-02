import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

data class myCard(val name: String, val items: List<CardItem>)
data class CardItem(val text: String, val date: String, val desc: String? = null)

// A component that displays a sidebar with a list of items
@Composable()
internal fun card(card: myCard) {
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = Color.White,
        modifier = Modifier.fillMaxWidth(0.95f).padding(top = 8.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
        ) {
            Text(
                text = card.name,
                style = MaterialTheme.typography.h5,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            card.items.forEach { item ->
                Text(
                    text = item.text,
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.padding(top = 8.dp)
                )
                Text(
                    text = item.date,
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(top = 8.dp).fillMaxWidth(),
                    textAlign = TextAlign.End
                )
                if(item.desc != null){
                    Text(
                        text = item.desc,
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.padding(top = 8.dp).fillMaxWidth(),
                        textAlign = TextAlign.Start
                    )
                }
            }
        }
    }
}