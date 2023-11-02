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
    Box(
        modifier = Modifier.fillMaxWidth().fillMaxHeight().background(color = Color(0xFFEDEDED))
    ){

        Column(
            modifier = Modifier.fillMaxWidth(0.3f).fillMaxHeight().background(color = Color(0xFFEDEDED)),
            horizontalAlignment = Alignment.CenterHorizontally) {
            sidebar(
                items = listOf("Mathis Verleene", "21 Ans", "Apprenti", "Permis B"),
                image = imageResources("photo_profile.jpeg"))
        }
        Column( modifier = Modifier.fillMaxWidth(0.7f).align(Alignment.TopEnd).fillMaxHeight()) {
            card(myCard("Studies", listOf(
                CardItem("Efficom - Lille", "2021 - 2023"),
                CardItem("IUT A - Lille", "2019 - 2021"),
                CardItem("Lycée Gustave Eiffel - Armentières", "2016 - 2019")
            )))
            card(myCard("Jobs", listOf(
                CardItem("Decathlon United", "2021 - 2023", "Apprentice Ops in Decathlon in BU Customer Growth. I manage infrastructure to deploy app like Decathlon Login."),
                CardItem("Groupe SEE", "2020 - 2021", "Apprentice Dev in a team of 4 peoples in Groupe SEE i've worked on an intranet for the company")
            )))
        }
    }
}

