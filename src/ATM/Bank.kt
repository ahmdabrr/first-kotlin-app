package ATM

open class Bank(name: String) {
    init {
        println("Welcome back, $name!")
    }

    constructor() {
        println("Thank you!")
    }

    fun minBalance(balance: Int, withdrawalValue: Int): Int {
        return balance - withdrawalValue
    }

    fun addBalance(balance: Int, depositValue: Int): Int {
        return  balance + depositValue
    }

    fun minBalance(balance: Int, withdrawalValue: Double): Int {
        val withdrawalValueInt = withdrawalValue.toInt()
        return balance - withdrawalValueInt
    }

    fun addBalance(balance: Int, depositValue: Double): Int {
        val depositValueInt = depositValue.toInt()
        return balance + depositValueInt
    }
}