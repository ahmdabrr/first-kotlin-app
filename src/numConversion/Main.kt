package numConversion

import kotlin.Array as Array1

fun main(args: Array1<String>){
    intro()
    process()
    end()
}

fun intro(){
    println("========================")
    println("== CONVERSION PROGRAM ==")
    println("========================")
}

fun end(){
    println("========================")
    println("==   BYE, THANK YOU   ==")
    println("========================")
}

fun choice(){
    println("Select Type of Conversion")
    println("A : Factorial to Decimal")
    println("B : Decimal to Binary")
    println("X : Exit")
    print("> ")
}

fun process(){
    val status: Boolean = true
    do {
        choice()
        when(readLine()) {
            "A" -> factorialToDecimal()
            "B" -> decimalToBinary()
            "X" -> return
            else -> {
                println("You type it wrong")
                again()
            }
        }
    } while (!status)
}

fun again(){
    print("Try again? (Y/N) : ")
    when (readLine()) {
        "Y" -> process()
        "N" -> return
        else -> {
            println("You type it wrong.")
            again()
        }
    }
}

fun factorialToDecimal(){
    print("Enter factorial number : ")
    val facToDec1: Int = Integer.valueOf(readLine())
    var facToDec2: Int = 1
    for (i in 1..facToDec1) facToDec2 *= i
    println("Decimal value of $facToDec1! is $facToDec2")
    again()
}

fun decimalToBinary(){
    var i: Int = 0
    val array = arrayOfNulls<Int>(32)
    print("Enter decimal number : ")
    var decToBin: Int = Integer.valueOf(readLine())
    var decToBinSwap = decToBin
    if (decToBin == 0) {
        array[0] = 0
        i = 1
    }
    else {
        while (decToBin != 0) {
            array[i] = decToBin%2
            decToBin /= 2
            i++
        }
    }
    print("Binary value of $decToBinSwap is ")
    for (j in i-1 downTo 0) {
        print("${array[j]}")
    }
    println()
    again()
}