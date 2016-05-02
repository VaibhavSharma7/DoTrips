dtcoreAppName = "DTCORE Config"

cloudinary.config = [
        cloud_name: "dotrips",
        api_key   : "954161662336371",
        api_secret: "Az2Nyxj1IlLH1wPvMNk3Y3reG5g",
        baseUrl   : "http://res.cloudinary.com/dotrips/",
        mimeType  : 'jpg'
]

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