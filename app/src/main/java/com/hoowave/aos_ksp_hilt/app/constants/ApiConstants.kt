package com.hoowave.aos_ksp_hilt.app.constants

object ApiConstants {
    const val USERS_URL = "http://192.168.100.131:7777/api/user"
    const val LAYOUTS_URL = "http://192.168.100.131:7778/api/layouts"

    object Users {
        const val REGISTER = "$USERS_URL/register"
        const val LOGIN = "$USERS_URL/login"
    }

    object Layouts {
        const val HEADER_LIST = "$LAYOUTS_URL/header/list"
    }
}