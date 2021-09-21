package com.github.megaing.larkintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.megaing.larkintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
