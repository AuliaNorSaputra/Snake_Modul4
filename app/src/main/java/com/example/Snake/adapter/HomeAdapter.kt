package com.example.Snake.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.Snake.R
import com.example.Snake.model.homeDataModel
import com.example.Snake.ui.home.HomeViewModel
import com.example.Snake.ui.home.HomeDetailActivity

class HomeAdapter (
    private val context: Context,
    private val dataset : List<homeDataModel>
): RecyclerView.Adapter<HomeAdapter.homeViewHolder>(){
    private val viewModel = HomeViewModel()

    class homeViewHolder(val view:View):RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.slideImage)
        val nameText: TextView = view.findViewById(R.id.slideTitle)
        val descText: TextView = view.findViewById(R.id.descHome)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): homeViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.home_item, parent, false)
        return homeViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: homeViewHolder, position: Int) {
        val item = dataset[position]
        holder.nameText.text = context.resources.getString(item.NameResId)
        holder.imageView.setImageResource(item.ImageResId)
        holder.descText.text = context.resources.getString(item.DescriptionResId)

        holder.view.setOnClickListener {
            viewModel.setData(item, context)
            val intent = Intent(context, HomeDetailActivity::class.java).apply {
                putExtra("image", viewModel.image.value)
                putExtra("name", viewModel.name.value)
                putExtra("desc", viewModel.desc.value)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size

}