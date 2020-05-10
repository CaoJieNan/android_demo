package cn.shenzhencj.jetpacklibrary.architecture.databinding.bind3

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import cn.shenzhencj.jetpacklibrary.R
import cn.shenzhencj.jetpacklibrary.databinding.FragmentDataBinding3Binding
import com.squareup.picasso.Picasso

/**
 * @BindingMethods
 * 因为@BindingMethod注解不能单独使用，
 * 必须要结合@BindingMethods才能发挥其功效，
 * 所以@BindingMethods注解其实就是一个容器，
 * 它内部有一个BindingMethod数组，
 * 存放的是一个一个的BindingMethod
 *
 * @BindingMethod
 * 注解需要与@BindingMethods注解结合使用才能发挥其功效
 * 有3个字段，这3个字段都是必填项，少一个都不行：
 * type：要操作的属性属于哪个View类，类型为class对象，比如：ImageView.class
 * attribute：xml属性，类型为String ，比如：”android:tint”
 * method：指定xml属性对应的set方法，类型为String，比如：”setImageTintList”
 *
 * @BindingConversion
 * 被该注解标记的方法，被视为dataBinding的转换方法
 *
 * @BindingAdapter
 * 绑定适配器，用来设置布局中View的自定义属性，当使用该属性时，可以自定义其行为。
 * 注意：如果你的Kotlin代码里面有使用到注解，那么需要加入这个插件：apply plugin: 'kotlin-kapt'
 *
 */
class DataBindingFragment3:Fragment() {

    companion object {
        //BindingAdapter修饰的方法必须是静态
        //requireAll表示参数可选
        @BindingAdapter("imageUrl", "imageError", requireAll = true)
        @JvmStatic
        fun loadImage(view:ImageView,url:String, error:Drawable){
            Picasso.get().load(url).error(error).into(view)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val dataBinding = DataBindingUtil.inflate<FragmentDataBinding3Binding>(
            inflater, R.layout.fragment_data_binding3,container,false)
        dataBinding.imageUrl="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1588935952996&di=e79e4cfcc6758cd8a78011d74fc3a492&imgtype=0&src=http%3A%2F%2Fd.ifengimg.com%2Fw600%2Fe0.ifengimg.com%2F01%2F2018%2F1125%2F19AA3D7883ED4B4715299053C797F99F4174ADA7_size109_w640_h370.jpeg"
        dataBinding.imageError = ContextCompat.getDrawable(context!!, R.drawable.image_error)
        return dataBinding.root
        return null
    }



}