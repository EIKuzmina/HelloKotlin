//fun main() {
//    val price = calculatePrice(10, 100, 10, level = "silver")
//    println(price)
//}
//
//fun calculatePrice(
//    itemCount: Int, itemPrice: Int,
//    discount: Int, discountStart: Int = 100,
//    level: String = "gold"
//): Int {
//    val total = itemPrice * itemCount
//    val discounted = if (total > discountStart) total - discount else total
//    return ((1 - userLevelToDiscount(level)) * discounted).toInt()
//
//}
//
//fun userLevelToDiscount(level: String) = when (level) {
//    "silver" -> 0.05
//    "gold" -> 0.1
//    else -> 0.0
//}
// ФУНКЦИИ