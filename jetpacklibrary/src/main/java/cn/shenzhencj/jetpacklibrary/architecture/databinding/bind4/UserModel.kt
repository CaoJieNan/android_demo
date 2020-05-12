package cn.shenzhencj.jetpacklibrary.architecture.databinding.bind4

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel


class UserModel:ViewModel() {

    var name:LiveData<String>? = null
    var age:LiveData<Int>? = null

}