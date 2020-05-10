package cn.shenzhencj.jetpacklibrary.architecture.databinding.bind1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import cn.shenzhencj.jetpacklibrary.R
import cn.shenzhencj.jetpacklibrary.databinding.FragmentDataBinding1Binding

/**
 * 普通的试图绑定用法
 */
class DataBindingFragment1(): Fragment() ,
    IView {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val dataBinding = DataBindingUtil.inflate<FragmentDataBinding1Binding>(
            inflater, R.layout.fragment_data_binding1, container, false)
        dataBinding.user = User("caojie", "123456", 5)
        dataBinding.age = 24
        dataBinding.sex = "男"
        dataBinding.listData = listOf("one", "two","three")
        dataBinding.mapData = mapOf("one" to "1", "two" to "2" ,"three" to "3")
        dataBinding.provinceControl=false
        dataBinding.workyearControl=true
        dataBinding.event=EventListener()
        dataBinding.iview=this
        dataBinding.presenter=Presenter()
        return dataBinding.root
    }

    override fun showToast() {
        Toast.makeText(context, "我是监听器绑定", Toast.LENGTH_LONG).show()
    }
}