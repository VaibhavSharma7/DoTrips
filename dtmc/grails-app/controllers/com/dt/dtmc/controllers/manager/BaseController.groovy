package com.dt.dtmc.controllers.manager

class BaseController {

    def coreExceptionService

    /** Log exception */
    def logException(Exception e) {
        coreExceptionService.logException(e)
        render (view: "/com/dt/dtmc/gsps/manager/error" ,model: [statusCode : 500])
    }
}
