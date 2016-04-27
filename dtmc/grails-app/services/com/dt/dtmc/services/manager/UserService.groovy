import com.dt.dtmc.User

class UserService {

    def springSecurityService

    User getLoggedInUserDetails() {
        User user = springSecurityService.getCurrentUser()
        log.info("UserService :: getCurrentUser")
        user
    }
}
