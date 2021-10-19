import java.util.*

class InputUI {
    private val sc: Scanner = Scanner(System.`in`)

    companion object {
        const val GAME_OVER = "1"
    }

    fun inputNumber(): String {
        return sc.nextLine()
    }

    fun printIntroduce() {
        print("숫자를 입력해 주세요 : ")
    }

    fun printResult(game: Game) {
        if (game.ball != 0) {
            print("${game.ball}볼 ")
        }
        if (game.strike != 0) {
            print("${game.strike}스트라이크")
        }
        if (game.strike == 0 && game.ball == 0) {
            print("0볼 0스트라이크")
        }
        println()
    }

    fun printReplay() {
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
    }
}