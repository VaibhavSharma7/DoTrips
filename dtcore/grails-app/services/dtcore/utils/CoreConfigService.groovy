package dtcore.utils

import grails.transaction.Transactional
import org.springframework.beans.factory.annotation.Value

class CoreConfigService {

    static transactional = false

    @Value('${dtcoreAppName}')
    String dtcoreAppName

    @Value('${grails.dtcoreAppProperties.dtcoreUrl.ip}')
    String dtcoreIp

    @Value('${grails.dtcoreAppProperties.dtcoreUrl.port}')
    String dtcorePort
}
