fun main() {
    val inputUI = InputUI()
    val game = Game()
    val numberGenerator = NumberGenerator()
    var isContinue = true
    while (isContinue) {
        isContinue = progress(inputUI, game, numberGenerator)
    }
}

private fun progress(
    inputUI: InputUI,
    game: Game,
    numberGenerator: NumberGenerator,
): Boolean {
    inputUI.printIntroduce()
    val userNumbers = inputUI.inputNumber()
    game.play(BaseballNumbers(numberGenerator.result), BaseballNumbers(userNumbers))
    inputUI.printResult(game)
    return checkResult(game, inputUI, numberGenerator)
}

private fun checkResult(game: Game, inputUI: InputUI, numberGenerator: NumberGenerator): Boolean {
    if (game.isAnswer()) {
        inputUI.printReplay()
        numberGenerator.generateRand()
        return inputUI.inputNumber() == InputUI.GAME_OVER
    }
    return true
}