package com.example.swadeshibazar

object CartManager {
    private val cartItems = mutableListOf<SeedItem>()

    fun addItemToCart(item: SeedItem) {
        cartItems.add(item)
    }

    fun getCartItems(): List<SeedItem> = cartItems

    fun calculateSubtotal(): Double = cartItems.sumOf { it.price }

    fun calculateTax(): Double = calculateSubtotal() * 0.15 // 15% tax

    fun calculateDeliveryCharge(): Double = 50.0 // Flat delivery charge
}
