package uts.Ergi.mobile.activity.login

import uts.Ergi.mobile.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}