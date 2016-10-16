package models

import models.base.Context
import models.base.interfaces.Renderable

class Skill(override val value: String) : Renderable {
    var count = 1
    var order = 1
    var weight = 0f

    init {
        Context.setOrIncrease(this)
    }

    override fun toString(): String {
        return value
    }
}