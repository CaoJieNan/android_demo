package cn.shenzhencj.jetpacklibrary.architecture.lifecycles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.shenzhencj.jetpacklibrary.R

/**
 *
 */
class LifeCyclesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycles)

        //通过调用 Lifecycle 类的 addObserver() 方法并传递观察者的实例来添加观察者
        val observer = MyObserver()
        lifecycle.addObserver(observer)
    }
}
