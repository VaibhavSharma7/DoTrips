import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.FileAppender
import grails.util.BuildSettings
import grails.util.Environment


// See http://logback.qos.ch/manual/groovy.html for details on configuration

def bySecond = timestamp("dd-MM-yyyy")
def targetDir = BuildSettings.TARGET_DIR

appender('STDOUT', ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%level %logger - %msg%n"
    }
}

appender("FULL_STACKTRACE", FileAppender) {
    file = "${targetDir}/dtmc_logs_${bySecond}.log"
    append = true
    encoder(PatternLayoutEncoder) {
        pattern = "%level %logger - %msg%n"
    }
}

root(ERROR, ['STDOUT'])

if (Environment.isDevelopmentMode() && targetDir) {
    logger("grails.app", ALL, ['FULL_STACKTRACE'], false)
}
