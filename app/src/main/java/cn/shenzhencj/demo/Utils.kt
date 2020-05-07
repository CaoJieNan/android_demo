package cn.shenzhencj.demo

import android.content.Context

object Utils {
    fun dip2px(context: Context, dpValue:Float) : Int {
        val scale = context.resources.displayMetrics.density;
        return (dpValue * scale + 0.5f).toInt()
    }
    fun pix2dip(context: Context, pxValue:Float): Int {
        val scale = context.resources.displayMetrics.density;
        return (pxValue / scale + 0.5f).toInt()
    }
}