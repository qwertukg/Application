package views

import kotlinx.html.*
import models.base.Info
import models.Photo

// <img src="..." alt="..." class="img-thumbnail">
fun DIV.imageBlock(photo: Photo, block: IMG.() -> Unit = {}) {
    img {
        src = photo.src
        alt = photo.alt
        width = photo.width
        height = photo.height
        classes = photo.classes
    }
}

fun DIV.infoBlock(info: Info, block: DIV.() -> Unit = {}) {
    if (!info.label.isEmpty()) span("text-muted") {
        attributes["style"] = "padding-right: 5px;"
        +info.label
    }

    if (!info.icon.isEmpty()) i(info.icon) {
        attributes["style"] = "padding-right: 5px;"
        attributes["aria-hidden"] = "true"
    }

    if (!info.url.isEmpty()) a(info.url) { block() } else block()

    if (!info.mark.isEmpty()) span("text-muted") {
        attributes["style"] = "padding-left: 5px;"
        +info.mark
    }
}

fun DIV.subHeaderBlock(block: DIV.() -> Unit = {}) {
    div("text-uppercase text-muted") {
        attributes["style"] = "margin-top: 20px;"
        block()
    }

    hr { attributes["style"] = "margin-top: 0; margin-bottom: 10px;" }
}
