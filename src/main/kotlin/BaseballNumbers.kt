import java.lang.IllegalArgumentException

class BaseballNumbers(strNumbers: String) {

    val baseballNumbers: List<BaseballNumber>

    init {
        validate(strNumbers)
        baseballNumbers = strNumbers.chunked(1).map { BaseballNumber(it.toInt()) }
    }

    companion object {
        const val NUMBER_SIZE = 3
        val REGEX = Regex("[0-9]+$")
    }

    private fun validate(strNumber: String) {
        if (strNumber.length != NUMBER_SIZE) {
            throw IllegalArgumentException()
        }
        if (!strNumber.matches(REGEX)) {
            throw IllegalArgumentException()
        }
    }
}