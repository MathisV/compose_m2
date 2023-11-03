import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.path
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition
import network.data.Answer
import network.data.Question

//private val quizRepository = QuizRepository()

@Composable
internal fun rootNavHost() {

    val navigator = rememberNavigator()
    NavHost(
        navigator = navigator,
        navTransition = NavTransition(),
        initialRoute = "/welcome",
    ) {
        scene(
            route = "/welcome",
            navTransition = NavTransition(),
        ) {
            welcomeScreen(navigator)
        }
        scene(
            route = "/quiz",
            navTransition = NavTransition(),
        ) {

            val questions =
                listOf(
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


            if (questions.isNotEmpty()) {
                questionScreen(navigator, questions)
            }
        }
        scene(
            route = "/score/{score}",
            navTransition = NavTransition(),
        ) { backStackEntry ->
            backStackEntry.path<String>("score")?.let { score ->
                scoreScreen(navigator, score)
            }
        }
    }
}