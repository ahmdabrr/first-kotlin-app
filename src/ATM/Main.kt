package ATM

fun main(args: Array<String>) {
    print("Enter your name : ")
    val name: String = readLine().toString()
    val atmObject: ATM = ATM(name)
    atmObject.run()
//    val bankObject: Bank = Bank()
}