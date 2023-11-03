import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import network.data.Answer
import network.data.Question
import org.jetbrains.compose.resources.ExperimentalResourceApi

@Composable
internal fun App() {
    MaterialTheme {
        //myCV()
        //welcomeScreen()
        //scoreScreen(18)
        rootNavHost()
        /*val questions = listOf(
            Question(
                1,
                "What is the capital of France?",
                1,
                listOf(Answer(1, "Paris"), Answer(2, "London"), Answer(3, "Berlin"))
            ),
            Question(
                2,
                "What is the capital of Germany?",
                3,
                listOf(Answer(1, "Paris"), Answer(2, "London"), Answer(3, "Berlin"))
            ),
            Question(
                3,
                "What is the capital of England?",
                2,
                listOf(Answer(1, "Paris"), Answer(2, "London"), Answer(3, "Berlin"))
            )
        )
        questionScreen(navigator = null, questions = questions)*/
    }
}

expect fun getPlatformName(): String