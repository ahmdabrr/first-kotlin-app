package ATM

import java.lang.NumberFormatException
import java.text.DecimalFormat
import java.text.NumberFormat
import javax.xml.datatype.DatatypeConfigurationException

open class ATM(name: String) : Bank(name) {
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
                "A" -> balance()
                "B" -> withdrawal()
                "C" -> deposit()
                "X" -> return
                else -> println("Sorry. You type it wrong.")
            }

            print("Try again? (Y/N) : ")
            again = readLine().toString()
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
            else println("Must be multiple of Rp. 50,000")
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
            if (depositValue%50000 == 0) println("Your Balance Rp. ${formatter.format(this.balance)}")
            else println("Must be multiple of Rp. 50,000")
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