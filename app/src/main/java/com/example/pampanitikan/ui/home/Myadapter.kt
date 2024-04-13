package com.example.pampanitikan.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pampanitikan.R

class Myadapter(private val context: Context) :
    RecyclerView.Adapter<Myadapter.ViewHolder>() {

    private var dataList: List<Datas> = listOf()
    private var itemClickListener: OnItemClickListener? = null

    interface OnItemClickListener {
        fun onItemClick(data: Datas)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val textContent: TextView = itemView.findViewById(R.id.tvAuthor)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                itemClickListener?.onItemClick(dataList[position])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]
        holder.imageView.setImageResource(data.imageResId)
        holder.textTitle.text = data.title
        holder.textContent.text = data.content
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    fun setDataList(newList: List<Datas>) {
        dataList = newList
        notifyDataSetChanged()
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.itemClickListener = listener
    }
}

