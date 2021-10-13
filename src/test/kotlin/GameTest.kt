import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GameTest {
    @Test fun `생성`() {
        val game = Game()
        assertEquals(game.numbers.size, 3)
    }
}