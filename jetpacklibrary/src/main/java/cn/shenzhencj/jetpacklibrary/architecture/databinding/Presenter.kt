package cn.shenzhencj.jetpacklibrary.architecture.databinding

import android.view.View
import android.widget.Toast

class Presenter {
    fun apply(iview:IView){
        iview.showToast()
    }
}