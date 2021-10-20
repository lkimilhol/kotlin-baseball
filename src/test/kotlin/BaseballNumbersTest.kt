import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith

internal class BaseballNumbersTest {
    @Test fun `생성`() {
        // given
        // when
        // then
        assertEquals(3, BaseballNumbers(NumberGenerator().result).baseballNumbers.size)
    }

    @Test fun `생성실패_숫자가아닌문자_포함`() {
        // given
        // when
        // then
        assertFailsWith<IllegalArgumentException> { BaseballNumbers("1b2") }
    }

    @Test fun `생성실패_길이가_3이_아님`() {
        // given
        // when
        // then
        assertFailsWith<IllegalArgumentException> { BaseballNumbers("1234") }
    }
}
