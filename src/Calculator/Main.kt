package Calculator

fun main(args: Array<String>) {
    val name: String = "WISNU"
    var again: String = "Y"
    name.titleApp()
    do {
        println("")
        println("A: Addition")
        println("B: Subtraction")
        println("C: Multiply")
        println("D: Division")
        print("Select your Calculator : ")

        when (readLine()) {
            "A" -> AdditionalCalc().run()
            "B" -> SubtractionCalc().run()
            "C" -> MultiplyCalc().run()
            "D" -> DivisionCalc().run()
            else -> print("Sorry. You type it wrong.")
        }

        print("Try again? (Y/N) : ")
        again = readLine().toString()
    } while (again == "Y")
}

// implementation of extension function
internal fun String.titleApp() {
    println("======================================")
    println("==          HI, I AM $this          ==")
    println("======================================")
    println("==       WELCOME TO MY PROGRAM      ==")
    println("======================================")
}