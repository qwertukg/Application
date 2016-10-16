package models

class Photo(val src: String, val alt: String = "", val width: String = "180", val height: String = "180") {
    val classes = setOf("img-thumbnail")
}