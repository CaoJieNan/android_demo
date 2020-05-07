package cn.shenzhencj.jetpacklibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import cn.shenzhencj.jetpacklibrary.architecture.ArchitectureActivity

class JetpackActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jetpack)
    }
    fun onFoundationClick(view:View){
            startActivity(Intent(this, ArchitectureActivity::class.java))
    }
    fun onArchitectureClick(view:View){

    }
    fun onBehaviorClick(view:View){

    }
    fun onUIClick(view:View){

    }

}
