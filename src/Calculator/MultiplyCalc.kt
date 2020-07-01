package Calculator

class MultiplyCalc: Calculator(){
    internal fun run() {
        print("Enter your first number : ")
        val firstNum = Integer.valueOf(readLine())
        print("Enter your second number: ")
        val secondNum = Integer.valueOf(readLine())

        println("The Multiply is ${toMul(firstNum, secondNum)}")
    }
}