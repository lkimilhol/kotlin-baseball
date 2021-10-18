import Number.Companion.NUMBER_RANGE_MAX
import Number.Companion.NUMBER_RANGE_MIN

class NumberGenerator {
    companion object {
        const val NUMBER_SIZE = 3
    }

    val result: List<Number> = generateRand()

    private fun generateRand(): List<Number> {
        val numbers: MutableList<Number> = mutableListOf()
        while (numbers.size < NUMBER_SIZE) {
            val rand = (NUMBER_RANGE_MIN..NUMBER_RANGE_MAX).random()
            numbers.add(Number(rand))
        }
        return numbers
    }
}
