package views

import kotlinx.html.DIV
import kotlinx.html.div
import kotlinx.html.hr

fun DIV.subHeaderBlock(block: DIV.() -> Unit = {}) {
    div("text-uppercase text-muted") {
        attributes["style"] = "margin-top: 20px;"
        block()
    }

    hr { attributes["style"] = "margin-top: 0; margin-bottom: 10px;" }
}