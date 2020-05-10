package cn.shenzhencj.jetpacklibrary.architecture.databinding.bind2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.*
import androidx.fragment.app.Fragment
import cn.shenzhencj.jetpacklibrary.R
import cn.shenzhencj.jetpacklibrary.databinding.FragmentDataBinding2Binding

//可观察数据对象
//ObservableBoolean
//ObservableByte
//ObservableChar
//ObservableShort
//ObservableInt
//ObservableLong
//ObservableFloat
//ObservableDouble
//ObservableParcelable

class DataBindingFragment2:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val dataBinding = DataBindingUtil.inflate<FragmentDataBinding2Binding>(
            inflater, R.layout.fragment_data_binding2,container,false)
        dataBinding.userage = ObservableInt(25)
        dataBinding.username = ObservableField("caojie")
        dataBinding.userdata = ObservableArrayMap<String, String>().apply {
            put("all", "这里面是map的数据")
        }
        dataBinding.userlist = ObservableArrayList<Any>().apply {
            add("这里面是list的数据")
        }



        return dataBinding.root
    }



}