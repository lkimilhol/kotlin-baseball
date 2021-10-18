import BaseballNumbers.Companion.NUMBER_SIZE

class Game() {
    var strike = 0
    var ball = 0

    fun play(computer: BaseballNumbers, user: BaseballNumbers) {
        for (i in 0 until NUMBER_SIZE) {
            if (matchStrike(computer.numbers[i], user.numbers[i])) {
                strike++
                continue
            }

            if (matchBall(computer, user.numbers[i])) {
                ball++
            }
        }
    }

    private fun matchStrike(computerNumber: Number, userNumber: Number): Boolean {
        return computerNumber == userNumber
    }

    private fun matchBall(computer: BaseballNumbers, userNumber: Number): Boolean {
        return computer.numbers.contains(userNumber)
    }
}