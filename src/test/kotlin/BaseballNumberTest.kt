import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith

internal class BaseballNumberTest {
    @Test fun `생성_실패_number_음수`() {
        assertFailsWith<IllegalArgumentException> {
            BaseballNumber(-1)
        }
    }
}