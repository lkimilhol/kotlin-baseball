import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GameTest {
    @Test fun `3스트라이크`() {
        val game = Game()
        game.play(BaseballNumbers("123"), BaseballNumbers("123"))
        assertEquals(3, game.strike)
        assertEquals(0, game.ball)
    }

    @Test fun `1스트라이크1볼`() {
        // given
        val game = Game()
        // when
        game.play(BaseballNumbers("123"), BaseballNumbers("134"))
        // then
        assertEquals(1, game.strike)
        assertEquals(1, game.ball)
    }

    @Test fun `2볼`() {
        // given
        val game = Game()
        // when
        game.play(BaseballNumbers("123"), BaseballNumbers("314"))
        // then
        assertEquals(0, game.strike)
        assertEquals(2, game.ball)
    }

    @Test fun `낫띵`() {
        // given
        val game = Game()
        // when
        game.play(BaseballNumbers("123"), BaseballNumbers("456"))
        // then
        assertEquals(0, game.strike)
        assertEquals(0, game.ball)
    }
}
