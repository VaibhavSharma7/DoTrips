import com.dt.dtmc.User

class DtmcTagLib {

    static namespace = "dtmc"
    def userService
    def errorsViewStackTracePrinter


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
    }


}