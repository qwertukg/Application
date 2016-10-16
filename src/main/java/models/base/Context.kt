package models.base

import models.Skill

object Context {
    val skills: MutableList<Skill> = mutableListOf()
    var order = 1
    fun setOrIncrease(new: Skill) {
        skills.filter { it.value == new.value }.forEach { it.count++ }

        if (skills.find {it.value == new.value} == null) {
            new.order = order++
            skills.add(new)
        }

        skills.forEach { it.weight = it.count / it.order.toFloat() }
    }
}