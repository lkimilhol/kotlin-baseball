class BaseballNumber (val number: Int) {
    companion object {
        const val NUMBER_RANGE_MIN = 1
        const val NUMBER_RANGE_MAX = 9
    }

    init {
        if (number < NUMBER_RANGE_MIN || number > NUMBER_RANGE_MAX) throw IllegalArgumentException()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BaseballNumber

        if (number != other.number) return false

        return true
    }

    override fun hashCode(): Int {
        return number
    }
}
