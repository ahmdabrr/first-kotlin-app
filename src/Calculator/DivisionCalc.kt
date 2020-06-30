package Calculator

class DivisionCalc: Calculator(){
    internal fun run() {
        print("Enter your first number : ")
        val firstNum = Integer.valueOf(readLine())
        print("Enter your second number: ")
        val secondNum = Integer.valueOf(readLine())

        showResult(firstNum, secondNum)
    }

    private fun showResult(firstNum: Int, secondNum: Int) {
        println("The Sum is ${toDiv(firstNum, secondNum)}")
    }
}