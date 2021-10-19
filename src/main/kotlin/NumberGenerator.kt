import BaseballNumbers.Companion.NUMBER_SIZE
import BaseballNumber.Companion.NUMBER_RANGE_MAX
import BaseballNumber.Companion.NUMBER_RANGE_MIN

class NumberGenerator {
    val result: String = generateRand()

    private fun generateRand(): String {
        val baseballNumbers: MutableList<Int> = mutableListOf()
        var numberToString = ""
        while (baseballNumbers.size < NUMBER_SIZE) {
            val rand = (NUMBER_RANGE_MIN..NUMBER_RANGE_MAX).random()
            if (!baseballNumbers.contains(rand)) {
                baseballNumbers.add(rand)
                numberToString += rand
            }
        }
        return numberToString
    }
}
