package com.example.kotlinmvplogin.Model

import android.text.TextUtils
import android.util.Patterns

class User(override val email: String, override val password: String) : IUser {
    override fun isDataValid(): Int {
        if (TextUtils.isEmpty(email))
            return 0 // 0 error code is empty email
        else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
            return 1 // error code 1 is wrong pattern
        else if (password.length <= 6)
            return 2 // 2 error code is password length must be greater than 6
        else
            return -1 // -1 is success code
    }

}