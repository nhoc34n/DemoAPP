package com.example.swadeshibazar

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class ActivitySeeds : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seeds) // Link to the activity_seeds.xml layout

        // Find the back icon
        val backIcon: ImageView = findViewById(R.id.backIcon)

        // Set click listener to finish the activity and go back
        backIcon.setOnClickListener {
            onBackPressed()
        }

        // Setup RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        // Assume SeedAdapter is already defined to populate the RecyclerView
        recyclerView.adapter = SeedAdapter(getSeedsList())

        // Handle Cart Button Click
        val cartButton: ImageButton = findViewById(R.id.cartButton)
        cartButton.setOnClickListener {
            // Navigate to the Cart Activity
            val intent = Intent(this, ActivityCart::class.java)
            startActivity(intent)
        }
    }

    private fun getSeedsList(): List<SeedItem> {
        // Replace with actual data fetching or dummy data
        return listOf(
            SeedItem("Seed 1", "Description 1", R.drawable.seed, 10.0),
            SeedItem("Seed 2", "Description 2", R.drawable.seed, 15.0)
        )
    }
}
