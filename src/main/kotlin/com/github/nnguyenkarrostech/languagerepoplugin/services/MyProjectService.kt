package com.github.nnguyenkarrostech.languagerepoplugin.services

import com.github.nnguyenkarrostech.languagerepoplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
