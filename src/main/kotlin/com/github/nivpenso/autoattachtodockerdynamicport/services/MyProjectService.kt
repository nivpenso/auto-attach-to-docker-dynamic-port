package com.github.nivpenso.autoattachtodockerdynamicport.services

import com.intellij.openapi.project.Project
import com.github.nivpenso.autoattachtodockerdynamicport.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
