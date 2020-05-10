package cn.shenzhencj.jetpacklibrary.architecture.databinding.bind2

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import cn.shenzhencj.jetpacklibrary.BR

class UserObservable(): BaseObservable() {

    @get:Bindable
    var userage = 20
    set(value) {
        field=value
        notifyPropertyChanged(BR.userage)
    }

    @get:Bindable
    var username = "caojie"
    set(value) {
        field=value
        notifyPropertyChanged(BR.username)
    }

}