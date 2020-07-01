package ATM

import java.lang.NumberFormatException
import java.text.DecimalFormat
import java.text.NumberFormat

open class ATM(name: String) : Bank(name) {
    private val realPin: String = "123456"
    private var balance = 500000
    private var status: Int = 0
    var again = "Y"
    var formatter: NumberFormat = DecimalFormat("#,###")

    open fun run() {
        var pin: String

        do {
            status = 0
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
            do {
                status = 1
                println("")
                println("A: Balance Check")
                println("B: Cast Withdrawal")
                println("C: Cast Deposit")
                println("X: Exit")
                print("Enter your choice : ")

                when (readLine()) {
                    "A" -> balance()
                    "B" -> withdrawal()
                    "C" -> deposit()
                    "X" -> return
                    else -> {
                        println("Sorry. You type it wrong.")
                        status = 0
                    }
                }
            } while (status == 0)

            do {
                print("Try again? (Y/N) : ")
                again = readLine().toString()
                if (!(again == "Y" || again == "N")) println("Sorry. You type it wrong")
            } while (!((again == "Y") || (again == "N")))

        } while (again == "Y")
    }

    private fun balance() {
        println("Your Balance : Rp. ${showBalance()}")
    }

    private fun withdrawal() {
        try {
            print("Your Withdrawal : Rp. ")
            val withdrawalValue = Integer.valueOf(readLine())

            if (withdrawalValue > this.balance) {
                println("Not enough balance")
                return
            }
            this.balance = minBalance(this.balance, withdrawalValue)
            if (withdrawalValue%50000 == 0) println("Your Balance Rp. ${formatter.format(this.balance)}")
            else {
                println("Must be multiple of Rp. 50,000")
                withdrawal()
            }
        }
        catch (e: NumberFormatException) {
            println("Input error. Must be Number.")
            withdrawal()
        }
    }

    private fun deposit() {
        try {
            print("Your Deposit : Rp. ")
            val depositValue = Integer.valueOf(readLine())
            this.balance = addBalance(this.balance, depositValue)

            if (depositValue == 0) println("Cannot withdraw Rp. 0")
            else if (depositValue%50000 == 0) println("Your Balance Rp. ${formatter.format(this.balance)}")
            else {
                println("Must be multiple of Rp. 50,000")
                withdrawal()
            }
        }
        catch (e: NumberFormatException) {
            println("Input error. Must be Number.")
            deposit()
        }
    }

    private fun showBalance(): String {
        return formatter.format(balance)
    }
}