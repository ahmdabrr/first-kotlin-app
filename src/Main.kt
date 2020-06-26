import java.lang.StringBuilder

fun main(args: Array<String>) {
    val myName = "WISNU"

    myGreeting(myName)
    dataTypeLimit()
}

internal fun myGreeting(name: String){
    println("======================================")
    println("==          HI, I AM $name          ==")
    println("======================================")
    println("==       WELCOME TO MY PROGRAM      ==")
    println("======================================")
}

private fun dataTypeLimit(){
    var integer1:Int = Int.MIN_VALUE
    var integer2:Int = Int.MAX_VALUE
    println("Integer Data Type")
    println("Minimul value : $integer1")
    println("Maximum value : $integer2\n")

    var long1:Long = Long.MIN_VALUE
    var long2:Long = Long.MAX_VALUE
    println("Long Data Type")
    println("Minimum value : $long1")
    println("Maximum value : $long2\n")

    var float1:Float = Float.MIN_VALUE
    var float2:Float = Float.MAX_VALUE
    println("Float Data Type")
    println("Minimum value : $float1")
    println("Maximum value : $float2\n")

    var double1:Double = Double.MIN_VALUE
    var double2:Double = Double.MAX_VALUE
    println("Double Data Type")
    println("Minimum value : $double1")
    println("Maximum value : $double2\n")

    var string1 = StringBuilder()
    string1.append("this-is-string-value").append(1)
    string1.clear()
    var string2 = Integer.MAX_VALUE
    println("String Data Type")
    println("Minimum value : ${string1.length}")
    println("Maximum value : $string2\n")
}