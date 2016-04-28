package com.dt.dtmc

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode(includes = 'emailId')
@ToString(includes = 'emailId', includeNames = true, includePackage = false)
class User implements Serializable {

    private static final long serialVersionUID = 1

    transient springSecurityService


    String id
    String emailId
    String password
    String lastPassword
    String title
    String firstName
    String lastName
    String lastUpdatedBy
    String createdBy
    Date passwordExpiryDate
    Date passwordChangedDate
    Date dateOfBirth
    Date lastUpdatedDate
    Date createdDate
    int isSuperAdmin
    int isLocked
    int isDeleted
    int isPasswordExpired
    int isPasswordChangeReqd


    static transients = ['springSecurityService']

    static constraints = {
        password blank: false, password: true
        emailId blank: false, unique: true
        passwordExpiryDate nullable: true, blank: false
        isSuperAdmin nullable: false, blank: false
        passwordChangedDate nullable: true, blank: false
        title nullable: true, blank: false
        dateOfBirth nullable: true, blank: false
        firstName nullable: false, blank: false
        isLocked nullable: false, blank: false
        lastPassword nullable: true, blank: false
        isDeleted nullable: false, blank: false
        isPasswordExpired nullable: false, blank: false
        isPasswordChangeReqd nullable: false, blank: false
        lastUpdatedDate nullable: false, blank: false
        lastUpdatedBy nullable: false, blank: false
        createdDate nullable: false, blank: false
        createdBy nullable: false, blank: false

    }

    static mapping = {
        id generator: 'uuid', sqlType: "varchar(50)"
        emailId sqlType: "varchar(100)"
        password column: '`password`', sqlType: "varchar(75)"
        lastPassword sqlType: "varchar(50)"
        title sqlType: "varchar(5)"
        firstName sqlType: "varchar(70)"
        lastName sqlType: "varchar(70)"
        isLocked sqlType: "smallint(1)", defaultValue: "0"
        isDeleted sqlType: "smallint(1)", defaultValue: "0"
        isPasswordExpired sqlType: "smallint(1)", defaultValue: "0"
        isPasswordChangeReqd sqlType: "smallint(1)", defaultValue: "1"
        isSuperAdmin sqlType: "smallint(1)", defaultValue: "0"
        lastUpdatedBy sqlType: "varchar(50)"
        createdBy sqlType: "varchar(50)"
    }

    User(String emailId, String password) {
        this()
        this.emailId = emailId
        this.password = password
    }

    Set<Role> getAuthorities() {
        UserRole.findAllByUser(this)*.role
    }

    def beforeInsert() {
        encodePassword()
    }

    def beforeUpdate() {
        if (isDirty('password')) {
            encodePassword()
        }
    }

    protected void encodePassword() {
        password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
    }

}
