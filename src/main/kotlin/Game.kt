import BaseballNumbers.Companion.NUMBER_SIZE

class Game() {
    private var strike = 0
    private var ball = 0

    fun play(computer: BaseballNumbers, user: BaseballNumbers) {
        init()
        for (index in 0 until NUMBER_SIZE) {
            match(computer, user, index)
        }
    }

    fun isAnswer(): Boolean = strike == ANSWER_COUNT

    private fun init() {
        strike = 0
        ball = 0
    }

    private fun match(computer: BaseballNumbers, user: BaseballNumbers, index: Int) {
        if (matchStrike(computer.baseballNumbers[index], user.baseballNumbers[index])) {
            strike++
            return
        }
        if (matchBall(computer, user.baseballNumbers[index])) {
            ball++
        }
    }

    private fun matchStrike(computerBaseballNumber: BaseballNumber, userBaseballNumber: BaseballNumber): Boolean {
        return computerBaseballNumber == userBaseballNumber
    }

    private fun matchBall(computer: BaseballNumbers, userBaseballNumber: BaseballNumber): Boolean {
        return computer.baseballNumbers.contains(userBaseballNumber)
    }

    companion object {
        const val ANSWER_COUNT = 3
    }
}
