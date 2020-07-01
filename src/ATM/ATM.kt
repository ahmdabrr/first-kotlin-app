package ATM

import java.text.DecimalFormat
import java.text.NumberFormat

open class ATM() {
    private val realPin: String = "123456"
    private var balance = 500000
    var status: Int = 0
    var again = "Y"

    var formatter: NumberFormat = DecimalFormat("#,###")

    open fun run() {
        var pin: String

        do {
            print("Enter PIN : ")
            pin = readLine().toString()
            if (pin.length != 6) {
                println("PIN must be 6 digit")
                status = 0
            } else if (pin != realPin) {
                println("Incorrect PIN")
                status = 0
            } else status = 1
        } while (status == 0)

        do {
            println("")
            println("A: Balance Check")
            println("B: Cast Withdrawal")
            println("C: Cast Deposit")
            print("Enter your choice : ")

            when (readLine()) {
                "A" -> balance()
                "B" -> withdrawal()
                "C" -> deposit()
//            "X" ->
                else -> print("Sorry. You type it wrong.")
            }

            print("Try again? (Y/N) : ")
            again = readLine().toString()
        } while (again == "Y")
    }

    private fun balance() {
        println("Your Balance : Rp. ${showBalance()}")
    }

    private fun withdrawal() {
        print("Your Withdrawal : Rp. ")
        var withdrawalValue = Integer.valueOf(readLine())
        if (withdrawalValue%50000 == 0) println("Your Balance Rp. ${minBalance(withdrawalValue)}")
        else println("Must be multiply by Rp. 50.000")
    }

    private fun deposit() {
        print("Your Deposit : Rp. ")
        var depositValue = Integer.valueOf(readLine())
        if (depositValue%50000 == 0) println("Your Balance Rp. ${addBalance(depositValue)}")
        else println("Must be multiply by Rp. 50.000")
    }

    private fun showBalance(): String {
        return formatter.format(balance)
    }

    private fun minBalance(withdrawalValue: Int): String? {
        this.balance -= withdrawalValue
        return formatter.format(balance)
    }

    private fun addBalance(depositValue: Int): String {
        this.balance += depositValue
        return formatter.format(balance)
    }
}