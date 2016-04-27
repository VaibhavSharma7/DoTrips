testKey = "ddd"
applicationVersion="One"
map = [name: "Vaibhav"]


environments {
    development {
        grails {
            elasticsearch {
                transportClientIP = "localhost"
                transportClientPort = 9300
                clusterName = "as_localHost"
                isHostedOnFound = false
            }
        }
    }
}