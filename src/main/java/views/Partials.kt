package views

import kotlinx.html.*

fun DIV.lineWithLabel(pair: Pair<*, *>? = null, block: P.() -> Unit = {}) {
    p {
        span("text-muted") { +pair?.first.toString() }
        +pair?.second.toString()
        block()
    }
}