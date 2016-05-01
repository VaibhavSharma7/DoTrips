import com.dt.dtmc.User

class DtmcTagLib {

    static namespace = "dtmc"
    def userService
    def errorsViewStackTracePrinter
    def coreExceptionService


    def removePreviousPageCache = {
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
    }

    def loggedInUserFirstName = {
        log.info("DTMC : logAllExceptions >>>>>")
        User user = userService.getLoggedInUserDetails()
        String userName = user?.firstName + " "+ user?.lastName
        out << "${userName}"
    }


    def logAllExceptions = { Map attrs ->
        log.info("DTMC : logAllExceptions >>>>>")
        Exception exception = (Exception)attrs.exception
        coreExceptionService.logException(exception)
    }

    def flashMessage = { Map attrs ->
        log.info("DTMC : flashMessage >>>>>")
        if (attrs.flashMessage){
            out << "<b>${attrs.flashMessage}</b>"
        }
    }


}