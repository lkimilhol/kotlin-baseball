import BaseballNumbers.Companion.NUMBER_SIZE
import BaseballNumber.Companion.NUMBER_RANGE_MAX
import BaseballNumber.Companion.NUMBER_RANGE_MIN

class NumberGenerator {
    val result: List<BaseballNumber> = generateRand()

    private fun generateRand(): List<BaseballNumber> {
        val baseballNumbers: MutableList<BaseballNumber> = mutableListOf()
        while (baseballNumbers.size < NUMBER_SIZE) {
            val rand = BaseballNumber((NUMBER_RANGE_MIN..NUMBER_RANGE_MAX).random())
            if (baseballNumbers.contains(rand)) continue else baseballNumbers.add(rand)
        }
        return baseballNumbers
    }
}
