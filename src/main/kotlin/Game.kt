class Game {
    companion object {
        const val NUMBER_SIZE = 3
        const val NUMBER_RANGE_MIN = 1
        const val NUMBER_RANGE_MAX = 9
    }

    val numbers: Set<Int> = generateRand()

    private fun generateRand(): Set<Int> {
        val numbers: MutableSet<Int> = mutableSetOf()
        while (numbers.size < NUMBER_SIZE) {
            val rand = (NUMBER_RANGE_MIN..NUMBER_RANGE_MAX).random()
            numbers.add(rand)
        }
        return numbers
    }
}
