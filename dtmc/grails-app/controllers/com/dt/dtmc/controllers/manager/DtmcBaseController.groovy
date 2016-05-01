package com.dt.dtmc.controllers.manager

import com.dt.dtmc.exceptions.DTMCException

class DtmcBaseController {

    def coreExceptionService

    /** Log exception */
    def logException(Exception e) {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
        coreExceptionService.logException(e)
        render (view: "/com/dt/dtmc/gsps/manager/error" ,model: [statusCode : 500])
    }
}
