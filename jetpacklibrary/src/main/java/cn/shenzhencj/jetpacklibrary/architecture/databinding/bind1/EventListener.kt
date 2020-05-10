package cn.shenzhencj.jetpacklibrary.architecture.databinding.bind1

import android.view.View
import android.widget.Toast

class EventListener {
    fun onClick1(view: View){
        Toast.makeText(view.context, "我是方法引用", Toast.LENGTH_LONG).show()
    }
}