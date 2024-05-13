fun main() {
    val itemPrice = 100
    val itemCount = 11
    val discount = 100
    val discountStart = 1_000
        val result = calculatePrice(1)
        println("Total price: $result")
    }

    fun calculatePrice(
        itemCount: Int,
        itemPrice: Int = 100,
        discount: Int = 100,
        discountStart: Int = 1_000,
        userLevel: String = "normal"
    ): Int {
        val total = itemPrice * itemCount
        val discounted = if (total > discountStart) total - discount else total
        return ((1 - userLevelToDiscount(userLevel)) * discounted).toInt()

    }

    fun userLevelToDiscount(level: String = "normal") = when (level) {
        "silver" -> 0.05
        "gold" -> 0.1
        else -> 0.0
    }
