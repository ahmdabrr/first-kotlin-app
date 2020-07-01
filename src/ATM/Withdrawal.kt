package ATM

open class Withdrawal: ATM() {
    fun run() {
        var atmObj: ATM = ATM()
        print("Your Withdrawal : Rp. ")
        var withdrawalValue = Integer.valueOf(readLine())

        println("Your Balance Rp. ${atmObj.minBalance(withdrawalValue)}")
    }
}