package com.dt.dtmc

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

//        "/"(view:"/index")
        "/"(controller:"home",action:"index")
        "500"(view:'/com/dt/dtmc/gsps/manager/error' ,params:[statusCode:500])
        "404"(view:'/notFound')
    }
}
