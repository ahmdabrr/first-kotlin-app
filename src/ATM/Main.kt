package ATM

fun main(args: Array<String>) {
    var status: Int = 0
    var pin: String
    val realPin: String = "123456"
    var again = "Y"
    var balanceObj: BalanceCheck = BalanceCheck()
    var withdrawalObj: Withdrawal = Withdrawal()
    var depositObj: Deposit = Deposit()

    do {
        print("Enter PIN : ")
        pin = readLine().toString()
        if (pin.length != 6) {
            println("PIN must be 6 digit")
            status = 0
        }
        else if (pin != realPin) {
            println("Incorrect PIN")
            status = 0
        }
        else status = 1
    } while (status == 0)

    do {
        println("")
        println("A: Balance Check")
        println("B: Cast Withdrawal")
        println("C: Cast Deposit")
        println("X: Exit")
        print("Enter your choice : ")

        when (readLine()) {
            "A" -> balanceObj.run()
            "B" -> withdrawalObj.run()
            "C" -> depositObj.run()
//            "X" ->
            else -> print("Sorry. You type it wrong.")
        }

        print("Try again? (Y/N) : ")
        again = readLine().toString()
    } while (again == "Y")


}