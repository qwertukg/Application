package models

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
            Block("full time", "", "", "Work schedule:"),
            Block("not important", "", "", "Desirable time in road:"),
            Block("Available for business trips")
    ))

    val workPlaces = listOf(
            WorkPlace("Framgia, Inc", "Hanoi", Block("framgia.co.jp", "http://framgia.co.jp"), "Senior Developer", "B2B information systems development", Period(2016, 6), listOf(
                    Skill("C#"),
                    Skill("ASP.NET"),
                    Skill("PHP"),
                    Skill("Laravel"),
                    Skill("Java"),
                    Skill("Unity"),
                    Skill("Kotlin"),
                    Skill("MySql"),
                    Skill("GIT"),
                    Skill("Sphinx")
            )),
            WorkPlace("The Republican Center of Electronic Healthcare", "Astana", Block(), "Chief specialist of IT systems modifications department", "Development and maintenance of the electronic healthcare national systems", Period(2015, 5, 2016, 6), listOf(
                    Skill("C#"),
                    Skill("ASP.NET"),
                    Skill("Entity Framework"),
                    Skill("PostgreSQL"),
                    Skill("MSSQL"),
                    Skill("Rest API"),
                    Skill("Web Service"),
                    Skill("SVN")
            )),
            WorkPlace("iBEC Systems LLP", "Almaty", Block("ibecsystems.com", "http://ibecsystems.com"), "Backend developer", "Development of high load web application for national post operator, stores, portals", Period(2013, 10, 2015, 5), listOf(
                    Skill("PHP"),
                    Skill("Laravel"),
                    Skill("Yii"),
                    Skill("JavaScript"),
                    Skill("JQuery"),
                    Skill("MySql"),
                    Skill("Redis"),
                    Skill("Rest API"),
                    Skill("GIT")
            )),
            WorkPlace("Azarov LLP", "Almaty", Block(), "Backend developer", "Implementation of massive web aggregator with framework use", Period(2013, 2, 2013, 9), listOf(
                    Skill("PHP"),
                    Skill("Laravel"),
                    Skill("JavaScript"),
                    Skill("JQuery"),
                    Skill("MySql"),
                    Skill("Redis"),
                    Skill("GIT")
            )),
            WorkPlace("Free Lance", "Almaty", Block(), "Backend developer", "Team work, implementation and maintenance of web applications", Period(2013, 1, 2013, 2), listOf(
                    Skill("PHP"),
                    Skill("Yii"),
                    Skill("JavaScript"),
                    Skill("JQuery"),
                    Skill("MySql"),
                    Skill("SVN")
            )),
            WorkPlace("ZamanPharm Almaty Distribution LLP", "Almaty", Block(), "Web developer", "Maintenance and support of 1C, Development, implementation and maintenance of web applications", Period(2010, 6, 2013, 1), listOf(
                    Skill("PHP"),
                    Skill("JavaScript"),
                    Skill("JQuery"),
                    Skill("MySql"),
                    Skill("MSSQL"),
                    Skill("1C")
            )),
            WorkPlace("East-Kazakhstan Regional library of А. S. Pushkin", "Ust-Kamenogorsk", Block(), "ICT adviser of informational communicational technologies", "Development and maintenance of web-sites, control and servers support", Period(2009, 5, 2010, 5), listOf(
                    Skill("PHP"),
                    Skill("JavaScript"),
                    Skill("JQuery"),
                    Skill("MySql"),
                    Skill("IIS")
            )),
            WorkPlace("Basis-IT Program-technical complex", "Ust-Kamenogorsk", Block(), "Head of Technical department", "Software development", Period(2008, 8, 2009, 3), listOf(
                    Skill("PHP"),
                    Skill("JavaScript"),
                    Skill("Visual Basic"),
                    Skill("MySql"),
                    Skill("Apache"),
                    Skill("1C")

            )),
            WorkPlace("Novaya Gavan' LLP", "Ust-Kamenogorsk", Block(), "Engraving equipment operator", "passed the training course from Austrian specialists, worked with laser engraving of dyeing patterns", Period(2007, 8, 2008, 8), listOf(
                    Skill("BestImage")
            )),
            WorkPlace("Basis-IT Program-technical complex", "Ust-Kamenogorsk", Block(), "3D graphic designer and operator of the coordinate-milling equipment", "Development and issuing of 3D objects, bas-reliefs, carved furniture", Period(2006, 11, 2007, 6), listOf(
                    Skill("ArtCam"),
                    Skill("NcStudio")
            )),
            WorkPlace("Soft service company", "Ust-Kamenogorsk", Block(), "Specialist of software and hardware", "Get a huge experience in search and elimination of the software and hardware problems of personal PCs, in compatibility and optimization work of PC systems", Period(2005, 7, 2006, 11), listOf(
                    Skill("Pascal"),
                    Skill("Visual Basic")
            )),
            WorkPlace("Image LLP", "Ust-Kamenogorsk", Block(), "Computer graphics designer", "Creation of all advertisements types, from the development till its implementation", Period(2004, 5, 2005, 6), listOf(
                    Skill("Corel Draw"),
                    Skill("Photoshop"),
                    Skill("3Dmax")
            ))
    )
}