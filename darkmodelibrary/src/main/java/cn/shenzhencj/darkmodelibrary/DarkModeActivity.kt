package cn.shenzhencj.darkmodelibrary

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_dark_mode.*

/**
 *
 * #暗黑模式#
 * 大家日常开发中肯定会有这种需求，官方定义的主题不完全能满足我们的需求，这时候就需要来自定义主题了，谷歌也为我们想到了这一点。
 * 普通模式下咱们不需要动，该怎么写怎么写，然后在res下再新建一个values-night的文件夹，然后把你自定义的放进去，
 * name起成和styles.xml中对应的主题名称就可以了
 *
 */

class DarkModeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dark_mode)

        when(AppCompatDelegate.getDefaultNightMode()){
            AppCompatDelegate.MODE_NIGHT_NO -> {
                if (dark_mode_sw.isChecked) dark_mode_sw.isChecked = false
            }
            AppCompatDelegate.MODE_NIGHT_YES -> {
                if (!dark_mode_sw.isChecked) dark_mode_sw.isChecked = true
            }
        }

        //切换主题
        dark_mode_sw.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                Log.i("DarkModeActivity", "Switch onCheckedChanged() -> isChecked = $isChecked")
                if (isChecked) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                }else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                }
            }
        })

        update_theme_rg.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                Log.i("DarkModeActivity", "RadioGroup onCheckedChanged() -> checkedId = $checkedId")
                when(checkedId){
                    R.id.normal_btn -> {
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                    }
                    R.id.dark_btn -> {
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                    }
                    R.id.system_btn -> {
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
                    }
                }
            }

        })


    }

    //当Activity声明它处理配置更改时，onConfigurationChanged()将在主题更改时调用其方法。
    //要检查当前主题是什么，应用可以运行如下代码：
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        val currentNightMode = newConfig.uiMode and Configuration.UI_MODE_NIGHT_MASK
        when (currentNightMode) {
            Configuration.UI_MODE_NIGHT_NO -> {
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                Log.i("DarkModeActivity", "夜间模式未启用，我们正在使用浅色主题")
            } // 夜间模式未启用，我们正在使用浅色主题
            Configuration.UI_MODE_NIGHT_YES -> {
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                Log.i("DarkModeActivity", "夜间模式启用，我们使用的是深色主题")
            } // 夜间模式启用，我们使用的是深色主题
        }
    }
}


