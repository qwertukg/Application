package models

import java.time.LocalDate

object Person {
    val name: String = "Daniil Rakhmatulin"
    val sex: Pair<String, String> = Pair("Sex", "Male")
    val dob: Pair<String, LocalDate> = Pair("Dob", LocalDate.of(1986, 4, 22))
    val age: Pair<String, Int> = Pair("Age", LocalDate.now().year - dob.second.year)
}