import org.junit.Test
import org.junit.Assert.*

class Main1KtTest {

    @Test
    fun calculatePriceShouldNotAddDiscount() { //скидка не применяется
        val itemPrice = 100
        val itemCount = 1
        val discount = 10
        val discountStart = 1_000
        val level = "gold"

        val result = calculatePrice(itemCount, itemPrice, discount, discountStart, level)
        assertEquals(90, result)
    }

    @Test
    fun calculatePriceShouldAddDiscount() { //проверяет применение скидки
        val itemPrice = 1000
        val itemCount = 1
        val discount = 10
        val discountStart = 100
        val level = "gold"

        val result = calculatePrice(itemCount, itemPrice, discount, discountStart, level)
        assertEquals(891, result)
    }
}