import com.dt.dtmc.Role
import com.dt.dtmc.User
import com.dt.dtmc.UserRole

class BootStrap {

    def init = { servletContext ->

        //Create User,Role & UserRole
        def adminRole = new Role('ROLE_ADMIN').save()
        def userRole = new Role('ROLE_USER').save()


        User adminUser = new User(firstName: "Super Admin",
                lastName: "User", emailId: "admin@dotrips.com",
                password: "admin",
                passwordExpiryDate: new Date(),
                isSuperAdmin:true,
                passwordChangedDate: new Date(),
                dateOfBirth: new Date(),
                title: "Mr.",isLocked:false,
                lastPassword:"fnskn",
                isDeleted:false,isPasswordExpired:false,
                isPasswordChangeReqd:false,
                lastUpdatedDate:new Date(),
                lastUpdatedBy:"dnksn",
                createdDate:new Date(),
                createdBy:"vdnknke",
                accountExpired: false,


        )
        adminUser.save(flush: true)

//        User normalUser = new User(firstName: "Simple User", lastName: "User", emailId: "normal@dotrips.com", password: "simple")
//        normalUser.save(flush: true)

        UserRole.create(adminUser, adminRole, true)
//        UserRole.create(normalUser, userRole, true)
    }
    def destroy = {
    }
}
