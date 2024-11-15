package com.example.swadeshibazar

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ActivityCart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart) // Link to the activity_cart.xml layout

        val cartItems = CartManager.getCartItems()


        // Setup RecyclerView
        val recyclerViewCart: RecyclerView = findViewById(R.id.recyclerViewCart)
        recyclerViewCart.layoutManager = LinearLayoutManager(this)
        // Assume CartAdapter is defined to populate the RecyclerView
        recyclerViewCart.adapter = CartAdapter(cartItems())

        // Update Summary
        val subTotalTextView: TextView = findViewById(R.id.subTotalTextView)
        val taxTextView: TextView = findViewById(R.id.taxTextView)
        val deliveryChargeTextView: TextView = findViewById(R.id.deliveryChargeTextView)
        val totalAmountTextView: TextView = findViewById(R.id.totalAmountTextView)

        // Calculate totals
        val subTotal = CartManager.calculateSubtotal(cartItems)
        val tax = CartManager.calculateTax(subTotal)
        val deliveryCharge = CartManager.calculateDeliveryCharge()
        val totalAmount = subTotal + tax + deliveryCharge

        // Update the UI
        subTotalTextView.text = "Subtotal: $${"%.2f".format(subTotal)}"
        taxTextView.text = "Taxes: $${"%.2f".format(tax)}"
        deliveryChargeTextView.text = "Delivery Charges: $${"%.2f".format(deliveryCharge)}"
        totalAmountTextView.text = "Amount to Pay: $${"%.2f".format(totalAmount)}"
    }


}
