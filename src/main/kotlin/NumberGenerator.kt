import BaseballNumbers.Companion.NUMBER_SIZE
import BaseballNumber.Companion.NUMBER_RANGE_MAX
import BaseballNumber.Companion.NUMBER_RANGE_MIN

class NumberGenerator {
    lateinit var result: String

    init {
        generateRand()
    }

    fun generateRand(){
        val baseballNumbers: MutableList<Int> = mutableListOf()
        var numberToString = ""
        while (baseballNumbers.size < NUMBER_SIZE) {
            val rand = (NUMBER_RANGE_MIN..NUMBER_RANGE_MAX).random()
            numberToString += addNumber(baseballNumbers, rand)
        }
        result = numberToString
    }

    private fun addNumber(baseballNumbers: MutableList<Int>, rand: Int): String {
        if (!baseballNumbers.contains(rand)) {
            baseballNumbers.add(rand)
            return rand.toString()
        }
        return ""
    }
}
