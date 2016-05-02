package com.dt.dtmc.services.manager

class HomeService {

    def coreHomeService
    def messageSource

    def renderHomePageData(boolean throwException) {
        String coreHomeServiceResponse = coreHomeService.testMethod()
        log.info("Log enabled in Dtmc Home Service ... " + coreHomeServiceResponse)
        /*if (throwException){
            throw new DTMCException(messageSource.getMessage("test.error.message", [] as Object[], "", null))
        }*/
        log.info("Home Service Ends ")
    }

    boolean mockingTest(){
        true
    }
}
