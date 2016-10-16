package models

class Photo(val src: String, val alt: String = "", val width: String = "150", val height: String = "230") {
    val classes = setOf("img-thumbnail")
}