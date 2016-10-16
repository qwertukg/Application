package views

import kotlinx.html.FlowContent
import kotlinx.html.IMG
import kotlinx.html.img
import models.Photo

// <img src="..." alt="..." class="img-thumbnail">
fun FlowContent.imageBlock(photo: Photo, block: IMG.() -> Unit = {}) {
    img {
        src = photo.src
        alt = photo.alt
        width = photo.width
        height = photo.height
        classes = photo.classes
    }
}