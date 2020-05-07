package cn.shenzhencj.demo

import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainViewHolder(val view:View, var itemClickListener: MainAdapter.OnItemClickListener?) : RecyclerView.ViewHolder(view) {
    val title = this.itemView.findViewById<TextView>(R.id.title_txt)
    val content = this.itemView.findViewById<TextView>(R.id.content_txt)

    init {
        this.view.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.i("MainViewHolder", "onClick()")
                itemClickListener?.onItemClick(this@MainViewHolder)
            }
        })
    }
}