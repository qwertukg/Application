import org.jetbrains.ktor.application.call
import org.jetbrains.ktor.http.ContentType
import org.jetbrains.ktor.jetty.embeddedJettyServer
import org.jetbrains.ktor.response.respondText
import org.jetbrains.ktor.routing.get
import views.Layout

fun main(args: Array<String>) {
    val content = Layout()
    embeddedJettyServer(8080) {
        get("/") {
            call.respondText(ContentType.Text.Html, content.html)
        }
    }.start()
}
