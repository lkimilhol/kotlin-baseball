import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GameTest {
    @Test fun `3스트라이크`() {
        val numbers = listOf(Number(1), Number(2), Number(3))
        val game = Game()
        game.play(BaseballNumbers(numbers), BaseballNumbers(numbers))
        assertEquals(3, game.strike)
    }
}