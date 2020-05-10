package cn.shenzhencj.jetpacklibrary.architecture.databinding.bind1

import cn.shenzhencj.jetpacklibrary.architecture.databinding.bind1.IView

class Presenter {
    fun apply(iview: IView){
        iview.showToast()
    }
}