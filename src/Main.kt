import java.lang.StringBuilder

fun main(args: Array<String>) {
    val myName = "WISNU"

    myGreeting(myName)
    dataTypeLimit()
}

internal fun myGreeting(name: String) {
    println("======================================")
    println("==          HI, I AM $name          ==")
    println("======================================")
    println("==       WELCOME TO MY PROGRAM      ==")
    println("======================================")
}

private fun dataTypeLimit() {
    var integer1: Int = Int.MIN_VALUE
    var integer2: Int = Int.MAX_VALUE
    println("Integer Data Type")
    println("Minimul value : $integer1")
    println("Maximum value : $integer2\n")

    var long1: Long = Long.MIN_VALUE
    var long2: Long = Long.MAX_VALUE
    println("Long Data Type")
    println("Minimum value : $long1")
    println("Maximum value : $long2\n")

    var float1: Float = Float.MIN_VALUE
    var float2: Float = Float.MAX_VALUE
    println("Float Data Type")
    println("Minimum value : $float1")
    println("Maximum value : $float2\n")

    var double1: Double = Double.MIN_VALUE
    var double2: Double = Double.MAX_VALUE
    println("Double Data Type")
    println("Minimum value : $double1")
    println("Maximum value : $double2\n")

    // since String is words. The minimum value of it is when we don't fill it OR when we reset it.
    // here I reset the string to assume the minimum String value.
    var string1 = StringBuilder()
    string1.append("this-is-string-value").append(1)
    string1.clear()
    // String length can be counted using function length().
    // since length() return integer value and actually String is an Array of words,
    // here I assume the maximum String value is the maximum value of integer can hold.
    // therefore I use Integer.MAX_VALUE.
    var string2 = Integer.MAX_VALUE
    println("String Data Type")
    println("Minimum value : ${string1.length}")
    println("Maximum value : $string2\n")
}