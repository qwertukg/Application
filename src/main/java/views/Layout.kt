package views

import kotlinx.html.*
import kotlinx.html.stream.createHTML
import models.Applicant
import models.base.Context
import java.time.format.DateTimeFormatter


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
                        imageBlock(Applicant.photo)
                    }
                    div("col-md-8") {
                        h1 {
                            attributes["style"] = "margin-top: 0;"
                            +Applicant.information.name
                        }

                        p {
                            +Applicant.information.sex
                            +", "
                            +Applicant.information.age.toString()
                            +" years old, date of birth "
                            +Applicant.information.dob.toString()
                        }

                        p {
                            Applicant.information.contacts.forEach {
                                div {
                                    infoBlock(it) { +it.toString() }
                                }
                            }
                        }

                        p {
                            Applicant.information.locations.forEach {
                                div {
                                    infoBlock(it) { +it.toString() }
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
                            +Applicant.desiredPosition.name
                        }
                        p { +Applicant.desiredPosition.description }
                        p {
                            Applicant.desiredPosition.directions.forEach {
                                small {
                                    infoBlock(it) { +it.toString() }
                                    br
                                }
                            }
                        }
                        p {
                            Applicant.desiredPosition.aditionals.forEach {
                                div {
                                    infoBlock(it) { +it.toString() }
                                }
                            }
                        }
                    }
                }

                val mask = DateTimeFormatter.ofPattern("LLLL yyyy")
                subHeaderBlock { +"Work experience " }
                Applicant.workPlaces.forEach {
                    div("row") {
                        attributes["style"] = "margin-bottom: 20px;"
                        div("col-md-2") {
                            small("text-muted") {
                                +"${it.period.from.format(mask)} — ${it.period.to.format(mask)}"
                                br
                                +"${it.period.from.until(it.period.to).toTotalMonths()} months"
                            }
                        }

                        div("col-md-8") {
                            h3 {
                                attributes["style"] = "margin-top: 0; margin-bottom: 0;"
                                +it.company
                            }

                            p {
                                span("text-muted") { +it.city }
                                +" "
                                infoBlock(it.website) { +it.website.toString() }
                            }

                            p {
                                div("text-uppercase") { +it.position }
                                +it.description
                            }

                            p {
                                it.skills.forEach {
                                    kbd("text-uppercase") {
                                        attributes["style"] = "margin-right: 5px; margin-bottom: 5px; float: left;"
                                        +it.toString()
                                    }
                                }
                            }
                        }
                    }
                }

                subHeaderBlock { +"Main skills" }
                div("row") {
                    div("col-md-2") {

                    }
                    div("col-md-8") {
                        p {
                            Context.skills.sortedByDescending { it.weight }.forEach {
//                              p { +"${it.value} -count- ${it.count} -order- ${it.order} -weight- ${it.weight}" }
                                kbd("text-uppercase") {

                                    attributes["style"] = "margin: 0 5px 5px 0; float: left;"
                                    +it.toString()
                                }
                            }
                        }

                    }
                }
            }
        }
    }
}


