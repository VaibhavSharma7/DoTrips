package com.dt.dtmc.domains

class BaseTrait {

    Date lastUpdatedDate
    Date createdDate
    boolean isDeleted

    String lastUpdatedBy
    String createdBy

    static constraints = {
        isDeleted nullable: false, blank: false
        lastUpdatedDate nullable: false, blank: false
        lastUpdatedBy nullable: false, blank: false
        createdDate nullable: false, blank: false
        createdBy nullable: false, blank: false
    }

    static mapping = {
        isDeleted sqlType: "smallint(1)", defaultValue: "0"
        lastUpdatedBy sqlType: "varchar(50)"
        createdBy sqlType: "varchar(50)"
    }
}