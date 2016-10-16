package models

import models.Block
import models.Skill
import java.time.LocalDate

object Applicant {

    val photo = Photo("https://hh.kz/photo/445402538.jpeg?t=1476550995&h=khIG633y-NgHdIZGKvBybQ", "— It's i am")

    val information = Information("Daniil Rakhmatulin", "Male", LocalDate.of(1986, 4, 22), listOf(
            Block("+84 91 574 7722"),
            Block("+7 705 274 1417"),
            Block("+7 723 250 2963"),
            Block("daniil.rakhmatulin@gmail.com", "mailto:daniil.rakhmatulin@gmail.com", "", "", "— desirable way of communication"),
            Block("qwert_ukg", "skype://qwert_ukg?call", "fa fa-skype", "", ""),
            Block("qwert.ukg", "https://www.facebook.com/qwert.ukg", "fa fa-facebook-square"),
            Block("qwertukg", "https://github.com/qwertukg", "fa fa-github-square")
    ), listOf(
            Block("Hanoi", "", "", "Place of living:"),
            Block("Kazakhstan", "", "", "Citizenship:"),
            Block("Kazakhstan, Russia, Armenia, Belarus", "", "", "Having permission to work in:"),
            Block("North America, Europe, Russia, Tatarstan", "", "", "Ready to move in:")
    ))

    val desiredPosition = DesiredPosition("Software Engineer", "IT technologies, Internet, Telecom", listOf(
            Block("Programming, Development", "", "", "— "),
            Block("System integration", "", "", "— "),
            Block("Web engineer", "", "", "— ")
    ), listOf(
            Block("full", "", "", "Occupation:"),
            Block("full time", "", "","Work schedule:"),
            Block("not important", "", "", "Desirable time in road:"),
            Block("Available for business trips")
    ))

    val workPlaces = listOf(
            WorkPlace("Framgia, Inc", "Hanoi", Block("framgia.co.jp", "http://framgia.co.jp/"), "Senior Developer", "B2B information systems development", Period(2016, 6), listOf(
                    Skill("C#"),
                    Skill("PHP"),
                    Skill("Java"),
                    Skill("Unity"),
                    Skill("Kotlin"),
                    Skill("MySql"),
                    Skill("Git"),
                    Skill("Sphinx")
            ))
    )
}