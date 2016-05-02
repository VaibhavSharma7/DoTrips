package com.dt.dtmc.controllers.manager

import com.dt.dtcore.exceptions.DTException
import com.dt.dtmc.User
import com.dt.dtmc.exceptions.DTMCException
import com.dt.dtmc.services.common.DtmcConfigService
import grails.core.GrailsApplication
import org.springframework.security.access.annotation.Secured

class HomeController /*extends DtmcBaseController*/ {

    def homeService
    GrailsApplication grailsApplication
    def coreExceptionService
    def dtmcConfigService


    @Secured('ROLE_ADMIN')
    def index() {
        try {
            log.info("HomeController .:: index .. info")
            log.warn("HomeController .:: index ...  warn")
            log.debug("HomeController .:: index ... debug")

            log.info("dtmcAppName :: " + dtmcConfigService.dtmcAppName)
            log.info("dtmcIp :: " + dtmcConfigService.dtmcIp)
            log.info("dtmcPort :: " + dtmcConfigService.dtmcPort)

            log.info("dtcoreAppName :: " + dtmcConfigService.dtcoreAppName)
            log.info("dtcoreIp :: " + dtmcConfigService.dtcoreIp)
            log.info("dtcorePort :: " + dtmcConfigService.dtcorePort)




            flash.message="Page Successfully loaded."
            homeService.renderHomePageData(true)
        }
        catch (Exception e) {
            flash.message="Some error occured"
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
