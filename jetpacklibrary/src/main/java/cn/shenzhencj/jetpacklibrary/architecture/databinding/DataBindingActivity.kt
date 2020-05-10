package cn.shenzhencj.jetpacklibrary.architecture.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import cn.shenzhencj.jetpacklibrary.R
import cn.shenzhencj.jetpacklibrary.architecture.databinding.bind1.DataBindingFragment1
import cn.shenzhencj.jetpacklibrary.architecture.databinding.bind1.IView
import cn.shenzhencj.jetpacklibrary.architecture.databinding.bind2.DataBindingFragment2
import cn.shenzhencj.jetpacklibrary.architecture.databinding.bind3.DataBindingFragment3

/**
 * Databinding在Activity和Fragment中使用的注意事项：
 * 1。在Activity中，可以直接使用 DataBindingUtil.setContentView，但是在Fragment中，不能这么用，
 * 否则的话会出现加载展示的一些问题。Fragment中应当这么使用：DataBindingUtil.inflate
 */

class DataBindingActivity : AppCompatActivity(),
    IView {

    val f1 = DataBindingFragment1()
    val f2 = DataBindingFragment2()
    val f3 = DataBindingFragment3()
    var current:Fragment?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        DataBindingUtil.setContentView<>()
//        DataBindingUtil.bind<>()
//        DataBindingUtil.inflate<>()

        //ListView 或 RecyclerView 适配器中使用数据绑定项
//        ListItemBinding.bind<>()
//        ListItemBinding.inflate<>()

        setContentView(R.layout.activity_data_binding)
    }

    override fun showToast() {
        Toast.makeText(this, "我是监听器绑定", Toast.LENGTH_LONG).show()
    }

    override fun onBackPressed() {
        if (current != null){
            supportFragmentManager
                .beginTransaction()
                .remove(current!!)
                .commit()
            current = null
            return
        }
        super.onBackPressed()
    }

    fun onClick1(view:View){
        toggle(f1)
    }
    fun onClick2(view:View){
        toggle(f2)
    }
    fun onClick3(view:View){
        toggle(f3)
    }

    fun onClick4(view:View){

    }

    private fun toggle(f:Fragment){
        current = f
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content_layout, f)
            .commit()
    }
}
