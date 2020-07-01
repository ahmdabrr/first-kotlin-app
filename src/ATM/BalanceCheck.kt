package ATM

open class BalanceCheck: ATM() {
    var atmObj: ATM = ATM()
    fun run() {
        println("Your Balance : Rp. ${atmObj.balance}")
    }
}