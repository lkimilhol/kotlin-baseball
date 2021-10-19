import BaseballNumbers.Companion.NUMBER_SIZE

class Game() {
    var strike = 0
    var ball = 0

    fun play(computer: BaseballNumbers, user: BaseballNumbers) {
        for (index in 0 until NUMBER_SIZE) {
            match(computer, user, index)
        }
    }

    private fun match(computer: BaseballNumbers, user: BaseballNumbers, index: Int) {
        if (matchStrike(computer.numbers[index], user.numbers[index])) {
            strike++
            return
        }
        if (matchBall(computer, user.numbers[index])) {
            ball++
        }
    }

    private fun matchStrike(computerNumber: Number, userNumber: Number): Boolean {
        return computerNumber == userNumber
    }

    private fun matchBall(computer: BaseballNumbers, userNumber: Number): Boolean {
        return computer.numbers.contains(userNumber)
    }
}