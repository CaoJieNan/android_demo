package cn.shenzhencj.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cn.shenzhencj.darkmodelibrary.DarkModeActivity
import cn.shenzhencj.jetpacklibrary.JetpackActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MainActivity", "onCreate()")

        val adapter = MainAdapter(getData())
        adapter.itemClickListener = object :MainAdapter.OnItemClickListener{
            override fun onItemClick(holder: MainViewHolder) {
                val clazz = adapter.getItem(holder.adapterPosition).clszz
                val intent = Intent(this@MainActivity, clazz as Class<*>)
                startActivity(intent)
            }
        }

        this.recyclerview.addItemDecoration(SpacesItemDecoration(Utils.dip2px(this, 16f)))
        this.recyclerview.itemAnimator = DefaultItemAnimator()
        this.recyclerview.layoutManager = LinearLayoutManager(this)
        this.recyclerview.adapter =adapter
    }

    private fun getData() : List<MainCard> {
        val darkModeCard = MainCard(getString(R.string.dark_mode_title),
            getString(R.string.dark_mode_content),
            DarkModeActivity::class.java)

        val jetpackCard = MainCard(getString(R.string.jetpack_title),
            getString(R.string.jetpack_content),
            JetpackActivity::class.java)

        return listOf(darkModeCard, jetpackCard)
    }

}
