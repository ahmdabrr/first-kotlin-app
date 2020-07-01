package ATM

open class Deposit: ATM() {
    fun run() {
        var atmObj: ATM = ATM()
        print("Your Deposit : Rp. ")
        var depositValue = Integer.valueOf(readLine())

        println("Your Balance Rp. ${atmObj.addBalance(depositValue)}")
    }
}