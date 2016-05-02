package com.dt.dtmc

import com.dt.dtcore.domains.BaseEntity
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode(includes = 'emailId')
@ToString(includes = 'emailId', includeNames = true, includePackage = false)
class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1

    transient springSecurityService


    String emailId
    String password
    String lastPassword
    String title
    String firstName
    String lastName

    Date passwordExpiryDate
    Date passwordChangedDate
    Date dateOfBirth

    boolean isSuperAdmin
    boolean isPasswordChangeReqd

    boolean enabled = true
    boolean accountExpired
    boolean isLocked
    boolean isPasswordExpired

    /*boolean enabled = true
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired*/

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

        isPasswordExpired nullable: false, blank: false
        isPasswordChangeReqd nullable: false, blank: false
        accountExpired nullable: false, blank: false
        enabled nullable: false, blank: false
    }

    static mapping = {
        emailId sqlType: "varchar(100)"
        password column: '`password`', sqlType: "varchar(75)"
        lastPassword sqlType: "varchar(50)"
        title sqlType: "varchar(5)"
        firstName sqlType: "varchar(70)"
        lastName sqlType: "varchar(70)"
        dateOfBirth sqlType: "date"
        isLocked sqlType: "tinyint(1)", defaultValue: "0"

        isPasswordExpired sqlType: "tinyint(1)", defaultValue: "0"
        isPasswordChangeReqd sqlType: "tinyint(1)", defaultValue: "1"
        isSuperAdmin sqlType: "tinyint(1)", defaultValue: "0"

        accountExpired sqlType: "tinyint(1)", defaultValue: "0"
        enabled sqlType: "tinyint(1)", defaultValue: "1"
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
