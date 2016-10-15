package models

import java.time.LocalDate

object PersonalData {
    val name: String    = "Daniil Rakhmatulin"
    val sex: String     = "Male"
    val dob: LocalDate = LocalDate.of(1986, 4, 22)
    val age: Int        = LocalDate.now().year - dob.year
}