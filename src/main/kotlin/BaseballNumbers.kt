class BaseballNumbers(strNumbers: String) {
    val baseballNumbers: List<BaseballNumber>

    init {
        validate(strNumbers)
        baseballNumbers = strNumbers.chunked(1).map { BaseballNumber(it.toInt()) }
    }

    private fun validate(strNumber: String) {
        require(strNumber.length == NUMBER_SIZE)
        require(strNumber.matches(REGEX))
    }

    companion object {
        const val NUMBER_SIZE = 3
        val REGEX = Regex("[0-9]+$")
    }
}
