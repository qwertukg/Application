package models

import models.Block
import java.time.LocalDate

class Information(val name: String, val sex: String, val dob: LocalDate, val contacts: List<Block>, val locations: List<Block>) {
    val age = LocalDate.now().year - dob.year
}