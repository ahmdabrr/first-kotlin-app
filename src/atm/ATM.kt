package atm

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
            } else if (pin != realPin) {
                println("Incorrect PIN")
                status = 0
            } else if (pin == realPin) {
                println("PIN correct")
                status = 1
            } else status = 0
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
            } else if (withdrawalValue%50000 != 0) {
                println("Withdrawal must be multiple of Rp. 50,000")
                return
            } else {
                this.balance = minBalance(this.balance, withdrawalValue)
                println("Withdrawal Success")
                println("Your Balance Rp. ${formatter.format(this.balance)}")
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

            if (depositValue%50000 != 0) {
                println("Deposit must be multiple of Rp. 50,000")
                return
            }
            else {
                this.balance = addBalance(this.balance, depositValue)
                println("Deposit Success")
                println("Your Balance Rp. ${formatter.format(this.balance)}")
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