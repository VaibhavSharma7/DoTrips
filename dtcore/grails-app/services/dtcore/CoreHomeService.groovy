package dtcore

import grails.transaction.Transactional

@Transactional
class CoreHomeService {

    String testMethod(){
//        int i=5/0
        "A testing string from testMethod() of CoreHomeService ..."

    }
}
