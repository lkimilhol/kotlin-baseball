class Game {

    val numbers: Set<Int> = generateRand()

    fun generateRand(): Set<Int> {
        val numbers: MutableSet<Int> = mutableSetOf()
        while (numbers.size < 3) {
            val rand = (1..9).random()
            numbers.add(rand)
        }
        return numbers
    }
}

