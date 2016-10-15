package models

import models.base.Info

object DesiredPosition {
    val title = "Software Engineer"
    val description = "IT technologies, Internet, Telecom"
    val directions  = listOf(
            Info("Programming, Development", "— ", "", "", ""),
            Info("System integration", "— ", "", "", ""),
            Info("Web engineer", "— ", "", "", "")
    )
    val aditionals = listOf(
            Info("full", "Occupation:", "", "", ""),
            Info("full time", "Work schedule:", "", "", ""),
            Info("not important", "Desirable time in road:", "", "", ""),
            Info("Available for business trips", "", "", "", "")
    )
}