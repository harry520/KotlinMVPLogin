package com.example.kotlinmvplogin.Model

interface IUser {

    val email: String
    val password: String
    fun isDataValid(): Int

}