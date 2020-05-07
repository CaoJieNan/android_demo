package cn.shenzhencj.demo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(private val data:List<MainCard>) : RecyclerView.Adapter<MainViewHolder>() {

    var itemClickListener:OnItemClickListener? = null

    interface OnItemClickListener {
        fun onItemClick(holder: MainViewHolder)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_main, parent, false)
        val holder = MainViewHolder(itemView, this.itemClickListener)
        return holder
    }

    override fun getItemCount() = this.data.size

    fun getItem(position: Int) = this.data[position]

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val card = this.data[position]
        holder.title.text = card.title
        holder.content.text= card.content
    }

}