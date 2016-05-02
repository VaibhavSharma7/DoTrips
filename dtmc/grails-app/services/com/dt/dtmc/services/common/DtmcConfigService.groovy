package com.dt.dtmc.services.common

import dtcore.utils.CoreConfigService
import org.springframework.beans.factory.annotation.Value

class DtmcConfigService extends CoreConfigService {

    static transactional = false

    @Value('${dtmcAppName}')
    String dtmcAppName

    @Value('${dtmcAppUrl.ip}')
    String dtmcIp

    @Value('${dtmcAppUrl.port}')
    String dtmcPort

}
