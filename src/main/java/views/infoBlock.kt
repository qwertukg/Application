package views

import kotlinx.html.DIV
import kotlinx.html.a
import kotlinx.html.i
import kotlinx.html.span
import models.Block

fun DIV.infoBlock(info: Block, block: DIV.() -> Unit = {}) {
    if (!info.prefix.isEmpty()) span("text-muted") {
        attributes["style"] = "padding-right: 5px;"
        +info.prefix
    }

    if (!info.icon.isEmpty()) i(info.icon) {
        attributes["style"] = "padding-right: 5px;"
        attributes["aria-hidden"] = "true"
    }

    if (!info.url.isEmpty()) a(info.url) { block() } else block()

    if (!info.postfix.isEmpty()) span("text-muted") {
        attributes["style"] = "padding-left: 5px;"
        +info.postfix
    }
}
