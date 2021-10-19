import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BaseballNumberGeneratorTest {
    @Test fun `생성`() {
        val game = NumberGenerator()
        assertEquals(game.result.length, 3)
    }
}