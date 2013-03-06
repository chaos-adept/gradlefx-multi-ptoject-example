import org.gradle.api.Project
import org.gradle.api.Plugin

class GreetingPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.task('hello') << {
            println "Hello from the GreetingPlugin ${project.projectDir}"
        }
    }
}