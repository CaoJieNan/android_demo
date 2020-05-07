package cn.shenzhencj.jetpacklibrary.architecture.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import cn.shenzhencj.jetpacklibrary.R
import cn.shenzhencj.jetpacklibrary.databinding.ActivityDataBindingBinding
import java.util.*

/**
 * Databinding在Activity和Fragment中使用的注意事项：
 * 1。在Activity中，可以直接使用 DataBindingUtil.setContentView，但是在Fragment中，不能这么用，
 * 否则的话会出现加载展示的一些问题。Fragment中应当这么使用：DataBindingUtil.inflate
 */

class DataBindingActivity : AppCompatActivity(), IView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //ActivityDataBindingBinding 是自动生成的

        val dataBinding = DataBindingUtil.setContentView<ActivityDataBindingBinding>(
            this, R.layout.activity_data_binding)
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

    }

    override fun showToast() {
        Toast.makeText(this, "我是监听器绑定", Toast.LENGTH_LONG).show()
    }
}
