package com.dt.dtmc.controllers.manager

import grails.core.GrailsApplication
import org.springframework.security.access.annotation.Secured

class HomeController extends BaseController {

    def homeService
    GrailsApplication grailsApplication


    @Secured('ROLE_ADMIN')
    def index() {
        try {
            log.info("HomeController .:: index .. info")
            log.warn("HomeController .:: index ...  warn")
            log.debug("HomeController .:: index ... debug")

            log.info("applicationVersion :: "+grailsApplication.config.applicationVersion)
            log.info("applicationNameDtmc :: "+grailsApplication.config.applicationNameDtmc)

            log.info("developers >>>> :: "+grailsApplication.config.map)
            log.info("developers >>>> :: "+grailsApplication.config["grails.elasticsearch.transportClientIP"])
//            homeService.renderHomePageData(true)
        }
        catch (Exception e){
            coreExceptionService.logException(e)
        }
        log.info("Invoking index() end")
        render(view: "/com/dt/dtmc/gsps/manager/home/index")
    }

    @Secured('ROLE_ADMIN')
    def simpleUser() {
        homeService.renderHomePageData(true)
        render(view: "/com/dt/dtmc/gsps/manager/home/simpleUser")
    }
}
