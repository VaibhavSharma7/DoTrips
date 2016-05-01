package com.dt.dtmc.services.manager

import com.dt.dtcore.exceptions.DTException
import com.dt.dtmc.*
import com.dt.dtmc.exceptions.DTMCException

class HomeService {

    def coreUserService
    def messageSource

    def renderHomePageData(boolean throwException) {
        String coreUserServiceResponse = coreUserService.testMethod()
        log.info("Log enabled in Dtmc Home Service ... " + coreUserServiceResponse)
        /*if (throwException){
            throw new DTMCException(messageSource.getMessage("test.error.message", [] as Object[], "", null))
        }*/
        log.info("Home Service Ends ")
    }

    boolean mockingTest(){
        true
    }
}
