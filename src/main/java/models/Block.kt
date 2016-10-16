package models

import models.base.interfaces.Renderable

class Block(override val value: String = "", val url: String = "", val icon: String = "", val prefix: String = "", val postfix: String = "") : Renderable {
    override fun toString(): String {
        return value
    }
}

