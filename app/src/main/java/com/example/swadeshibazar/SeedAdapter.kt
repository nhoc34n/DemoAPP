package com.example.swadeshibazar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SeedAdapter(
    private val seedList: List<SeedItem>,
    private val onAddToCartClick: (SeedItem) -> Unit
) : RecyclerView.Adapter<SeedAdapter.SeedViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeedViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_seed, parent, false)
        return SeedViewHolder(view)
    }

    override fun onBindViewHolder(holder: SeedViewHolder, position: Int) {
        val seedItem = seedList[position]

        // Bind data
        holder.seedName.text = seedItem.name
        holder.seedPrice.text = "৳ ${seedItem.price}"
        holder.seedImage.setImageResource(seedItem.imageResId)

        // Handle "Add to Cart" button click
        holder.addToCartButton.setOnClickListener {
            onAddToCartClick(seedItem)
        }
    }

    override fun getItemCount(): Int = seedList.size

    inner class SeedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val seedName: TextView = itemView.findViewById(R.id.seedName)
        val seedPrice: TextView = itemView.findViewById(R.id.seedPrice)
        val seedImage: ImageView = itemView.findViewById(R.id.seedImage)
        val addToCartButton: Button = itemView.findViewById(R.id.addToCartButton)
    }
}
