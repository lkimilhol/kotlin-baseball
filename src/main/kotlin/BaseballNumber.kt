data class BaseballNumber(val number: Int) {
    init {
        if (number !in NUMBER_RANGE_MIN..NUMBER_RANGE_MAX) {
            throw IllegalArgumentException()
        }
    }

    companion object {
        const val NUMBER_RANGE_MIN = 1
        const val NUMBER_RANGE_MAX = 9
    }
}
