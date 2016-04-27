package com.dt.dtmc.services.manager

import com.dt.dtcore.exceptions.DTException
import com.dt.dtmc.*

class HomeService {

    def coreUserService
    def messageSource

    def renderHomePageData(boolean throwException) throws DTException {
        String coreUserServiceResponse = coreUserService.testMethod()
        log.info("Log enabled in Dtmc Home Service ... " + coreUserServiceResponse)

        if (throwException){
            throw new DTException(messageSource.getMessage("test.error.message", [] as Object[], "", null))
        }
        log.info("Home Service Ends ")
    }
}
