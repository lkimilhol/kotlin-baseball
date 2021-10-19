import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BaseballNumbersTest {
    @Test
    fun `생성`() {
        assertEquals(3, BaseballNumbers(NumberGenerator().result).baseballNumbers.size)
    }
}