package dtcore

import grails.transaction.Transactional
import org.grails.exceptions.ExceptionUtils


class CoreExceptionService {

    def errorsViewStackTracePrinter

    /** Log exception */
    def logException(Exception e) {
        def root = ExceptionUtils.getRootCause(e)
        if (root) {
            root?.getClass()?.name ?: e.getClass().name
            log.error("Exception Root Class : " + root?.getClass()?.name ?: e.getClass().name)
            log.error("Exception Root Message : " + root.message)
        }
        def trace = errorsViewStackTracePrinter.prettyPrint(e.cause ?: e)
        log.error("Full stack trace :: " + trace)
    }
}
