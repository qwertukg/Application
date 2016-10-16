package models

import models.Block
import models.Skill

class WorkPlace(val company: String, val city: String, val website: Block, val position: String, val description: String, val period: Period, val skills: List<Skill>)