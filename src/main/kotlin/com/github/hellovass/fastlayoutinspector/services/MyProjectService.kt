package com.github.hellovass.fastlayoutinspector.services

import com.intellij.openapi.project.Project
import com.github.hellovass.fastlayoutinspector.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
