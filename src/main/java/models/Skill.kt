package models

import models.base.Context
import models.base.interfaces.Renderable

class Skill(override val value: String) : Renderable {
    override fun toString() : String {
        Context.setOrIncrease(value)

        return value
    }
}