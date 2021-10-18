import Number.Companion.NUMBER_RANGE_MAX
import Number.Companion.NUMBER_RANGE_MIN

class NumberGenerator {
    companion object {
        const val NUMBER_SIZE = 3
    }

    val result: Set<Number> = generateRand()

    private fun generateRand(): Set<Number> {
        val numbers: MutableSet<Number> = mutableSetOf()
        while (numbers.size < NUMBER_SIZE) {
            val rand = (NUMBER_RANGE_MIN..NUMBER_RANGE_MAX).random()
            numbers.add(Number(rand))
        }
        return numbers
    }
}
