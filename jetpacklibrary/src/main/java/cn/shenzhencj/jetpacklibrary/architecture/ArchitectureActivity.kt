package cn.shenzhencj.jetpacklibrary.architecture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import cn.shenzhencj.jetpacklibrary.R
import cn.shenzhencj.jetpacklibrary.architecture.databinding.DataBindingActivity

class ArchitectureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_architecture)
    }
    fun onDataBindingClick(view:View){
        startActivity(Intent(this, DataBindingActivity::class.java))
    }
    fun onLifecycleClick(view:View){
//        startActivity(Intent(this, DataBindingActivity::class.java))
    }
    fun onLiveDataClick(view:View){
//        startActivity(Intent(this, DataBindingActivity::class.java))
    }
    fun onNavigationClick(view: View){

    }
    fun onPagingClick(view: View){

    }
    fun onRoomClick(view: View){

    }
    fun onViewModelClick(view: View){

    }
    fun onWorkManagerClick(view: View){

    }


}
