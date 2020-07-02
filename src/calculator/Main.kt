package calculator

fun main(args: Array<String>) {
    val name: String = "WISNU"
    var again: String = "Y"
    val addCalcObj: AdditionalCalc = AdditionalCalc()
    val subCalcObj: SubtractionCalc = SubtractionCalc()
    val mulCalcObj: MultiplyCalc = MultiplyCalc()
    val divCalcObj: DivisionCalc = DivisionCalc()

    name.titleApp()
    do {
        println("")
        println("A: Addition")
        println("B: Subtraction")
        println("C: Multiply")
        println("D: Division")
        print("Select your Calculator : ")

        when (readLine()) {
            "A" -> addCalcObj.run()
            "B" -> subCalcObj.run()
            "C" -> mulCalcObj.run()
            "D" -> divCalcObj.run()
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