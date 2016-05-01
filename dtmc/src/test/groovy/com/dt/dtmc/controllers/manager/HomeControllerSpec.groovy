package com.dt.dtmc.controllers.manager

import com.dt.dtmc.services.manager.HomeService
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import grails.test.mixin.integration.Integration
import grails.transaction.Rollback
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */

@TestFor(HomeController)
@Integration
//@Rollback
class HomeControllerSpec extends Specification {

    @Autowired
    HomeService homeService

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect: "fix me"
        homeService.mockingTest() == true
    }
}
