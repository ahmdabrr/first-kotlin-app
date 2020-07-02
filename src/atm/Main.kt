package atm

fun main(args: Array<String>) {
    intro("BCA")
    print("Enter your name : ")
    val name: String = readLine().toString()
    val atmObject: ATM = ATM(name)
    atmObject.run()
    val bankObject: Bank = Bank(name, "Thank You")
    intro("BCA", "BYE")
}

fun intro(bank: String){
    println("========================")
    println("==      BANK $bank      ==")
    println("========================")
}

fun intro(bank: String, message: String){
    println("========================")
    println("==      BANK $bank      ==")
    println("==        $message         ==")
    println("========================")
}