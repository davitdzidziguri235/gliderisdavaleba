package com.example.marvelcharacters

import android.graphics.drawable.Drawable

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recycleview.Image

class ProductAdapter(private val products:List<Image>): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

        val imageView:ImageView=itemView.findViewById(R.id.vImage)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.prodact_item,parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val p =products[position]

        Glide.with(holder.imageView.context)
                .load(p.url)
                .into(holder.imageView)
    }

    override fun getItemCount(): Int = products.size
}