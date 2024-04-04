package ru.lighterpro.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin implements Plugin<Project> {

    @Override
    void apply(Project target) {
        target.tasks.register('hello') {
            description = "Hello task"
            group = "lighterpro"
            println("🥝🥝🥝🥝 Configuration phase. Task hello 🥝🥝🥝🥝")

            doLast {
                println("🌈🌈🌈🌈 Execution phase. Action 1.🌈🌈🌈🌈")
            }
            doFirst {
                println("🌈🌈🌈🌈 Execution phase. Action 2.🌈🌈🌈🌈")
            }
            doLast {
                println("🌈🌈🌈🌈 Execution phase. Action 3.🌈🌈🌈🌈")
            }

            println("task: \"$description\", group: $group, actions: ${actions.size()} ")
            println("task path: $path")
        }
    }
}