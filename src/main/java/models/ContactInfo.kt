package models

import models.base.Info

object ContactInfo {
    val items: List<Info> = listOf(
            Info("+84 91 574 7722", "", "", "", ""),
            Info("+7 705 274 1417", "", "", "", ""),
            Info("+7 723 250 2963", "", "", "", ""),
            Info("daniil.rakhmatulin@gmail.com", "", "", "mailto:daniil.rakhmatulin@gmail.com", "— desirable way of communication"),
            Info("qwert_ukg", "", "fa fa-skype", "skype://qwert_ukg?call", ""),
            Info("qwert.ukg", "", "fa fa-facebook-square", "https://www.facebook.com/qwert.ukg", ""),
            Info("qwertukg", "", "fa fa-github-square", "https://github.com/qwertukg", "")
    )
}