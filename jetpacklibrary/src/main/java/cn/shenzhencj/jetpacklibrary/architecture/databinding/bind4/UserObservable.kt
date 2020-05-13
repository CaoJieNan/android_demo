package cn.shenzhencj.jetpacklibrary.architecture.databinding.bind4

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import cn.shenzhencj.jetpacklibrary.BR

class UserObservable: BaseObservable() {
    private var userPassword:String? = ""
    private var userRemember:Boolean?=false

    @Bindable
    fun getUserPassword(): String? {
        return this.userPassword!!
    }

    fun setUserPassword(value:String){
        this.userPassword = value
//        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.userPassword)
        notifyPropertyChanged(BR.userPassword)
    }

    @Bindable
    fun getUserRemember(): Boolean {
        return this.userRemember!!
    }

    fun setUserRemember(value:Boolean){
        this.userRemember = value
//        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.userRemember)
        notifyPropertyChanged(BR.userRemember)
    }

    fun onRefreshData(){
        Log.i("UserObservable", "onRefreshData()")
        this.setUserPassword("123456")
        this.setUserRemember(!this.userRemember!!)
    }
}