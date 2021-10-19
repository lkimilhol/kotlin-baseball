import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GameTest {
    @Test fun `3스트라이크`() {
        val baseballNumbers = listOf(BaseballNumber(1), BaseballNumber(2), BaseballNumber(3))
        val game = Game()
        game.play(BaseballNumbers(baseballNumbers), BaseballNumbers(baseballNumbers))
        assertEquals(3, game.strike)
        assertEquals(0, game.ball)
    }

    @Test fun `1스트라이크1볼`() {
        // given
        val computer = listOf(BaseballNumber(1), BaseballNumber(2), BaseballNumber(3))
        val user = listOf(BaseballNumber(9), BaseballNumber(2), BaseballNumber(1))
        val game = Game()
        // when
        game.play(BaseballNumbers(computer), BaseballNumbers(user))
        // then
        assertEquals(1, game.strike)
        assertEquals(1, game.ball)
    }

    @Test fun `2볼`() {
        // given
        val computer = listOf(BaseballNumber(1), BaseballNumber(2), BaseballNumber(3))
        val user = listOf(BaseballNumber(4), BaseballNumber(3), BaseballNumber(2))
        val game = Game()
        // when
        game.play(BaseballNumbers(computer), BaseballNumbers(user))
        // then
        assertEquals(0, game.strike)
        assertEquals(2, game.ball)
    }

    @Test fun `낫띵`() {
        // given
        val computer = listOf(BaseballNumber(1), BaseballNumber(2), BaseballNumber(3))
        val user = listOf(BaseballNumber(4), BaseballNumber(5), BaseballNumber(6))
        val game = Game()
        // when
        game.play(BaseballNumbers(computer), BaseballNumbers(user))
        // then
        assertEquals(0, game.strike)
        assertEquals(0, game.ball)
    }
}
