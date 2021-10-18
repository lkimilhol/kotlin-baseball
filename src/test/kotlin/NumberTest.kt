import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith

internal class NumberTest {
    @Test fun `생성_실패_number_음수`() {
        assertFailsWith<IllegalArgumentException> {
            Number(-1)
        }
    }
}