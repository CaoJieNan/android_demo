package cn.shenzhencj.jetpacklibrary.architecture.databinding.bind3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import cn.shenzhencj.jetpacklibrary.R
import cn.shenzhencj.jetpacklibrary.databinding.AdapterRecyclerViewBinding

class RecyclerViewAdapter(val data:List<String> = listOf("one", "two", "three")):
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(val view:View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.adapter_recycler_view, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = this.data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = DataBindingUtil.bind<AdapterRecyclerViewBinding>(holder.itemView)
        binding!!.name = "test${position}"
    }
}