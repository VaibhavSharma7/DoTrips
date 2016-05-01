package com.dt.dtmc.controllers.manager

import com.dt.dtcore.exceptions.DTException
import com.dt.dtmc.User
import com.dt.dtmc.exceptions.DTMCException
import grails.core.GrailsApplication
import org.springframework.security.access.annotation.Secured

class HomeController /*extends DtmcBaseController*/ {

    def homeService
    GrailsApplication grailsApplication
    def coreExceptionService


    @Secured('ROLE_ADMIN')
    def index() {
        try {
            log.info("HomeController .:: index .. info")
            log.warn("HomeController .:: index ...  warn")
            log.debug("HomeController .:: index ... debug")

            log.info("applicationVersion :: " + grailsApplication.config.applicationVersion)
            log.info("applicationNameDtmc :: " + grailsApplication.config.applicationNameDtmc)

            log.info("developers >>>> :: " + grailsApplication.config.map)
            log.info("developers >>>> :: " + grailsApplication.config["grails.elasticsearch.transportClientIP"])

/*            User user = User.load('ff80818154619aaa0154619acd4b0000')


            log.info("User propr ::: >>> " + user.properties)

            if (user?.isLocked) {
                log.info("User is locked")
            } else {
                log.info("User is not locked")
            }*/

            homeService.renderHomePageData(true)
        }
        catch (DTMCException e) {
            coreExceptionService.logException(e)
        }
        log.info("Invoking index() end")
        render(view: "/com/dt/dtmc/gsps/manager/home/index")
    }

    @Secured('ROLE_ADMIN')
    def simpleUser() {
        homeService.renderHomePageData(true)
        render(view: "/com/dt/dtmc/gsps/manager/home/simpleUser" ,model: [name:"Vaibhav"])
    }

    @Secured('ROLE_ADMIN')
    def adminUser() {
//        homeService.renderHomePageData(true)
//        render(view: "/com/dt/dtmc/gsps/manager/home/simpleUser")
    }
}
