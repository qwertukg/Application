package models

import java.time.LocalDate

class Period(fromYear: Int, fromMonth: Int, toYear: Int = LocalDate.now().year, toMonth: Int = LocalDate.now().monthValue) {
    val from: LocalDate = LocalDate.of(fromYear, fromMonth, 1)
    val to: LocalDate = LocalDate.of(toYear, toMonth, 1)
}