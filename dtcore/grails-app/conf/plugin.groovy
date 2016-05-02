dtcoreAppName = "DTCORE Config"

environments {
    development {
        grails {
            dtcoreAppProperties {
                dtcoreUrl {
                    ip = "dtcoreLocalhost"
                    port = "dtcore8080"
                }
            }
        }
    }
}