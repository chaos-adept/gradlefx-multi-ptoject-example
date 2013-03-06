import org.gradle.api.Project
import org.gradle.api.Plugin
import org.apache.commons.lang.StringUtils

class GreetingPlugin implements Plugin<Project> {
    void apply(Project project) {
		
        project.task('hello') << {
            println "Hello new from the GreetingPlugin ${project.projectDir}" + StringUtils.escape(' hello from commons langs')
        }
    }
}