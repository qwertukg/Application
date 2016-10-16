package models.base

object Context {
    val skills : MutableMap<String, Int> = mutableMapOf()

    fun setOrIncrease(key: String) {
        val weight = skills[key]

        if (weight is Int) skills[key] = weight + 1
        else skills[key] = 1
    }
}