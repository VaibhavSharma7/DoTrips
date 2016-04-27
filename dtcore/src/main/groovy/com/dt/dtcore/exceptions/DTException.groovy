package com.dt.dtcore.exceptions

class DTException extends Exception {

  DTException(String message) {
    super(message)
//    LoggerUtil.debug(this.class, "AS Exception Occurred")
  }

}