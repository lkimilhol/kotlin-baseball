import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class NumberGeneratorTest {
    @Test fun `생성`() {
        val game = NumberGenerator()
        assertEquals(game.numbers.size, 3)
    }
}