package uts.Ergi.mobile.activity.register.presenter

interface RegisterView {
    fun onSuccessRegister()
    fun onErrorRegister(msg: String?)
}