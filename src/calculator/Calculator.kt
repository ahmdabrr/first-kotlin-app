package calculator

open class Calculator() {
    fun toAdd(firstNum: Int, secondNum: Int): Int {
        return firstNum + secondNum
    }

    fun toSub(firstNum: Int, secondNum: Int): Int {
        return firstNum - secondNum
    }

    fun toMul(firstNum: Int, secondNum: Int): Int {
        return firstNum * secondNum
    }

    fun toDiv(firstNum: Int, secondNum: Int): Double {
        return firstNum.toDouble() / secondNum.toDouble()
    }
}