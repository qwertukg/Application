import org.jetbrains.ktor.application.*
import org.jetbrains.ktor.http.*
import org.jetbrains.ktor.response.*
import org.jetbrains.ktor.routing.*
import org.jetbrains.ktor.jetty.*
import views.Content

fun main(args: Array<String>) {
    val content = Content()
    embeddedJettyServer(8080) {
        get("/") {
            call.respondText(ContentType.Text.Html, content.html)
        }
    }.start()
}
