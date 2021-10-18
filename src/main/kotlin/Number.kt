class Number (val number: Int) {
    companion object {
        const val NUMBER_RANGE_MIN = 1
        const val NUMBER_RANGE_MAX = 9
    }
    init {
        if (number < NUMBER_RANGE_MIN || number > NUMBER_RANGE_MAX) throw IllegalArgumentException()
    }
}