package cn.shenzhencj.jetpacklibrary.architecture.databinding.bind4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import cn.shenzhencj.jetpacklibrary.R
import cn.shenzhencj.jetpacklibrary.databinding.FragmentDataBinding4Binding

/**
 * @Bindable
 * 该注解用于双向绑定，需要与 notifyPropertyChanged()方法结合使用
 * 该注解用于标记实体类中的get方法或“is”开头的方法,且实体类必须继承BaseObserable.
 * 与notifyPropertyChanged()方法配合使用，当该字段中的数据被修改时，dataBinding会自动刷新对应view的数据
 */
class DataBindingFragment4: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentDataBinding4Binding>(
            inflater, R.layout.fragment_data_binding4, container, false)

        //使用 LiveData 将数据变化通知给界面
        binding.lifecycleOwner = this

        //使用 ViewModel 管理界面相关数据
        val userModel = ViewModelProvider(this).get(UserModel::class.java)
        binding.userModel = userModel

        //双向数据绑定
        binding.userObservable = UserObservable()

        return binding.root
    }
}