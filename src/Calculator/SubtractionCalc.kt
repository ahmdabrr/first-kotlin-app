package Calculator

class SubtractionCalc: Calculator(){
    internal fun run() {
        print("Enter your first number : ")
        val firstNum = Integer.valueOf(readLine())
        print("Enter your second number: ")
        val secondNum = Integer.valueOf(readLine())

        showResult(firstNum, secondNum)
    }

    private fun showResult(firstNum: Int, secondNum: Int) {
        println("The Subtraction is ${toSub(firstNum, secondNum)}")
    }
}