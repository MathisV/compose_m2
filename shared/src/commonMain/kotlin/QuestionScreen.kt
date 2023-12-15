import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import moe.tlaster.precompose.navigation.Navigator
import network.data.Question

@Composable
internal fun questionScreen(navigator: Navigator?, questions: List<Question>) {
    var questionProgress by remember { mutableStateOf(0) }
    var currentAnswer by remember { mutableStateOf(1) }
    var score by remember { mutableStateOf(0) }
    Box(
        modifier = Modifier.fillMaxWidth().fillMaxHeight().background(color = Color(0xFFEDEDED)),
        ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().fillMaxHeight(0.15f).padding(top = 8.dp),
            ) {
                Card(
                    shape = RoundedCornerShape(8.dp),
                    backgroundColor = Color.White,
                    modifier = Modifier.fillMaxWidth()
                        .padding(8.dp),
                ) {
                    Text(
                        text = questions[questionProgress].label,
                        style = MaterialTheme.typography.h6,
                        textAlign = TextAlign.Center,
                    )
                }
            }

                Column(
                    modifier = Modifier.fillMaxWidth().fillMaxHeight(0.5f).padding(top = 8.dp)
                ) {
                    questions[questionProgress].answers.forEach { item ->
                        Row {
                            RadioButton(
                                selected = currentAnswer == item.id,
                                onClick = { currentAnswer = item.id },
                            )
                            Text(
                                text = item.label,
                                style = MaterialTheme.typography.h5,
                                modifier = Modifier.padding(top = 8.dp),
                            )
                        }
                    }
                }


            Row(
                modifier = Modifier.fillMaxWidth().fillMaxHeight(0.15f).padding(top = 8.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Button(
                    onClick = {
                        if (currentAnswer == questions[questionProgress].correctAnswerId) {
                            score += 1
                        }
                        if(questionProgress < questions.size - 1){
                            questionProgress += 1
                            currentAnswer = 1
                        } else {
                            // Navigation to score screen
                            navigator?.navigate(route = "/score/$score out of ${questions.size}")
                        }  
                    },
                    shape = RoundedCornerShape(8.dp),
                ) {
                    if (questionProgress < questions.size - 1) {
                        Text(text =  "Next")
                    } else {
                        Text(text =  "Done")
                    }
                }
            }
            LinearProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .padding(top = 8.dp),
                progress = (questionProgress + 1) / questions.size.toFloat(),
                color = Color.Blue
            )
        }
    }
}
