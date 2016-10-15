package models

import models.base.Info

object DesiredPosition {
    val title: String = "Software Engineer"
    val description: String = "IT technologies, Internet, Telecom"
    val directions: List<Info> = listOf(
            Info("Programming, Development", "— ", "", "", ""),
            Info("System integration", "— ", "", "", ""),
            Info("Web engineer", "— ", "", "", "")
    )
    val aditionals: List<Info> = listOf(
            Info("full", "Occupation:", "", "", ""),
            Info("full time", "Work schedule:", "", "", ""),
            Info("not important", "Desirable time in road:", "", "", ""),
            Info("Available for business trips", "", "", "", "")
    )
}