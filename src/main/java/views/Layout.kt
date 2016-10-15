package views

import kotlinx.html.*
import kotlinx.html.stream.createHTML
import models.*



class Layout {
    val html: String = createHTML().html {
        head {
            styleLink("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css")
            styleLink("https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css")
        }
        body {
            div("container-fluid") {
                style = "padding: 50px;"
                div("row") {
                    div("col-md-2") {
                        imageBlock(Photo)
                    }
                    div("col-md-10") {
                        h1 {
                            attributes["style"] = "margin-top: 0;"
                            +Information.name
                        }

                        p {
                            +Information.sex
                            +", "
                            +Information.age.toString()
                            +" years old, date of birth "
                            +Information.dob.toString()
                        }

                        p {
                            for (contact in Information.contacts) {
                                div {
                                    infoBlock(contact) { +contact.toString() }
                                }
                            }
                        }

                        p {
                            for (location in Information.locations) {
                                div {
                                    infoBlock(location) { +location.toString() }
                                }
                            }
                        }
                    }
                }

                subHeaderBlock { +"Desired position" }
                div("row") {
                    div("col-md-12") {
                        h3 {
                            attributes["style"] = "margin-top: 0;"
                            +DesiredPosition.title
                        }
                        p { +DesiredPosition.description }
                        p {
                            for (direction in DesiredPosition.directions) {
                                small {
                                    infoBlock(direction) { +direction.toString() }
                                    br
                                }
                            }
                        }
                        p {
                            for (addition in DesiredPosition.aditionals) {
                                div {
                                    infoBlock(addition) { +addition.toString() }
                                }
                            }
                        }
                    }
                }

                div("row") {
                    div("col-md-2") {

                    }
                    div("col-md-10") {

                    }
                }
            }
        }
    }
}


