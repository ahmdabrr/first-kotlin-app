package atm

open class Bank(name: String) {
    init {
        //println("Welcome back, $name!")
    }

    constructor(name: String, message: String) : this(name) {
        println("$message, $name!")
    }

    fun minBalance(balance: Int, withdrawalValue: Int): Int {
        return balance - withdrawalValue
    }

    fun addBalance(balance: Int, depositValue: Int): Int {
        return  balance + depositValue
    }
}