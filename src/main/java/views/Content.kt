package views

import kotlinx.html.*
import kotlinx.html.stream.createHTML
import models.*

class Content {
    val html: String = createHTML().html {
        body {
            div("container") {
                div("row") {
                    div("col-md-3") {

                    }
                    div("col-md-9") {
                        h1 { +Person.name }
                        lineWithLabel(Person.sex)
                        lineWithLabel(Person.age) { +" years old" }
                    }
                }
                div("row") {
                    div("col-md-3") {

                    }
                    div("col-md-9") {

                    }
                }
            }
        }
    }
}


