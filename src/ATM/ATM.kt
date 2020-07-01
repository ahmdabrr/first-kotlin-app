package ATM

open class ATM() {
    var balance = 500000

    fun minBalance(withdrawalValue: Int): Int {
        this.balance -= withdrawalValue
        return this.balance
    }

    fun addBalance(depositValue: Int): Int {
        this.balance += depositValue
        return this.balance
    }
}