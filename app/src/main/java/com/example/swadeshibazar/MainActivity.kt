package com.example.swadeshibazar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Seeds Button Click Listener
        val seedsButton: Button = findViewById(R.id.seedsButton)
        seedsButton.setOnClickListener {
            val intent = Intent(this, ActivitySeeds::class.java)
            startActivity(intent)
        }
        // Navigate to CropsActivity
        val cropsButton: Button = findViewById(R.id.cropsButton)
        cropsButton.setOnClickListener {
            val intent = Intent(this, CropsActivity::class.java)
            startActivity(intent)
        }
        // Navigate to Livestocks
        val livestockButton: Button = findViewById(R.id.livestockButton)
        livestockButton.setOnClickListener {
            //  val intent = Intent(this, LivestockActivity::class.java)
            //  startActivity(intent)
            //  }
            // Navigate to Soil
            val soilButton: Button = findViewById(R.id.SoilButton)
            soilButton.setOnClickListener {
                //      val intent = Intent(this, SoilActivity::class.java)
                startActivity(intent)
            }
            // Vegetables Button
            val vegetablesButton: Button = findViewById(R.id.vegetablesButton)
            vegetablesButton.setOnClickListener {
             //   val intent = Intent(this, VegetablesActivity::class.java)
                startActivity(intent)
            }


        }
    }
}
