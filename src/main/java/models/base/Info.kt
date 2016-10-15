package models.base

class Info(val value: String, val label: String, val icon: String, val url: String, val mark: String) : Renderable {
    override fun toString(): String {
        return value
    }
}