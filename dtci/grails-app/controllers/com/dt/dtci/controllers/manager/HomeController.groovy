package com.dt.dtci.controllers.manager

import com.dt.dtcore.dtci.Vehicle


class HomeController {

    def index() {
        render (view: "/com/dt/dtci/gsps/manager/home/index", model: [vehicle: new Vehicle(name: "Volkswagen Vento")])

    }

}
