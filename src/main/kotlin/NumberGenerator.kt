import BaseballNumbers.Companion.NUMBER_SIZE
import Number.Companion.NUMBER_RANGE_MAX
import Number.Companion.NUMBER_RANGE_MIN

class NumberGenerator {
    val result: List<Number> = generateRand()

    private fun generateRand(): List<Number> {
        val numbers: MutableList<Number> = mutableListOf()
        while (numbers.size < NUMBER_SIZE) {
            val rand = Number((NUMBER_RANGE_MIN..NUMBER_RANGE_MAX).random())
            if (numbers.contains(rand)) continue else numbers.add(rand)
        }
        return numbers
    }
}
