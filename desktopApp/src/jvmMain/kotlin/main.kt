import androidx.compose.ui.window.application
import moe.tlaster.precompose.PreComposeWindow

fun main() = application { // kotlin application
    PreComposeWindow(onCloseRequest = ::exitApplication, title = "QuizApp") {
        MainView()
    }
}