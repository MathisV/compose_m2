import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Resource
import org.jetbrains.compose.resources.painterResource



@OptIn(ExperimentalResourceApi::class)
@Composable()
internal fun myCV(){
    // Create a first view like a curriculum vitae
    // It is simply compose of the following composables :
    // a Card rounded shape container with photo
    // a Text for the name
    // a Text for the job
    // a Text for the studies
    // a Text for the skills
    // Box for the CV
    Box(
        modifier = Modifier.fillMaxWidth().fillMaxHeight().background(color = Color(0xFFEDEDED))
    ){
        // Colum
        Column(
            modifier = Modifier.fillMaxWidth(0.3f).align(Alignment.TopStart).fillMaxHeight().background(color = Color(0xFFEDEDED)),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            // Image
            Image(
                painter = painterResource("compose-multiplatform.xml"),
                contentDescription = "My photo",
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = "Mathis",
                style = MaterialTheme.typography.h5
            )
            Text(
                text = "Verleene",
                style = MaterialTheme.typography.h5
            )
            Text(
                text = "Apprentice",
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
        Column( modifier = Modifier.fillMaxWidth(0.7f).align(Alignment.TopEnd).fillMaxHeight()) {
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color.White,
                modifier = Modifier.fillMaxWidth(0.95f).padding(top = 8.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(8.dp),
                ) {
                    Text(
                        text = "Studies",
                        style = MaterialTheme.typography.h5,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Efficom Lille",
                        style = MaterialTheme.typography.h6,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                    Text(
                        text = "2021 - 2023",
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.padding(top = 8.dp).fillMaxWidth(),
                        textAlign = TextAlign.End
                    )
                    Text(
                        text = "IUT A Lille",
                        style = MaterialTheme.typography.h6,
                        modifier = Modifier.padding(top = 8.dp),
                    )
                    Text(
                        text = "2019 - 2021",
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.padding(top = 8.dp).fillMaxWidth(),
                        textAlign = TextAlign.End
                    )
                    Text(
                        text = "High school Gustave Eiffel - Armentières",
                        style = MaterialTheme.typography.h6,
                        modifier = Modifier.padding(top = 8.dp),
                    )
                    Text(
                        text = "2016 - 2019",
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.padding(top = 8.dp).fillMaxWidth(),
                        textAlign = TextAlign.End
                    )
                }
            }
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color.White,
                modifier = Modifier.fillMaxWidth(0.95f).padding(top = 8.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(8.dp),
                ) {
                    Text(
                        text = "Jobs",
                        style = MaterialTheme.typography.h5,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Decathlon United",
                        style = MaterialTheme.typography.h6,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                    Text(
                        text = "Apprentice Ops in Decathlon in BU Customer Growth. I manage infrastructure to deploy app like Decathlon Login.",
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.padding(top = 8.dp),
                        textAlign = TextAlign.Justify
                    )
                    Text(
                        text = "Groupe SEE",
                        style = MaterialTheme.typography.h6,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                    Text(
                        text = "Apprentice Dev in a team of 4 peoples in Groupe SEE i've worked on an intranet for the company",
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.padding(top = 8.dp),
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

