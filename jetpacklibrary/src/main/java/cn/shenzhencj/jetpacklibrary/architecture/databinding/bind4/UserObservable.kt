package cn.shenzhencj.jetpacklibrary.architecture.databinding.bind4

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

class UserObservable: BaseObservable() {
    var userPassword2:String? = "123"
    var userRemember:Boolean?=true

    @Bindable
    fun getUserPassword(): String? {
        return this.userPassword2!!
    }

    fun setUserPassword(value:String){
        this.userPassword2 = value
        notifyPropertyChanged(BR.userPassword)
    }

    @Bindable
    fun getRememberMe(): Boolean {
        return this.userRemember!!
    }

    fun setRememberMe(value:Boolean){
        this.userRemember = value
        notifyPropertyChanged(BR.rememberMe)
    }

    fun onRefreshData(){
        Log.i("UserObservable", "onRefreshData()")
        this.setUserPassword("123456")
        this.setRememberMe(!this.userRemember!!)
    }
}