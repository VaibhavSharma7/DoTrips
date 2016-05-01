package com.dt.dtmc.exceptions

import com.dt.dtcore.exceptions.DTException

class DTMCException extends DTException {

  DTMCException(String message) {
    super(message)
//    LoggerUtil.debug(this.class, "AS Exception Occurred")
  }

}