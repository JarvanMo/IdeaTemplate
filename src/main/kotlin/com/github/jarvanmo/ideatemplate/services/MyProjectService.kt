package com.github.jarvanmo.ideatemplate.services

import com.intellij.openapi.project.Project
import com.github.jarvanmo.ideatemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
