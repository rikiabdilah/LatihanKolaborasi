//fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    fun main() {
        print("Masukkan angka pertama: ")
        val num1 = readLine()?.toDouble()

        print("Masukkan angka kedua: ")
        val num2 = readLine()?.toDouble()

        print("Pilih operasi (+, -, *, /): ")
        val operator = readLine()

        val result = when(operator) {
            "+" -> num1?.plus(num2!!)
            "-" -> num1?.minus(num2!!)
            "*" -> num1?.times(num2!!)
            "/" -> num1?.div(num2!!)
            else -> null
        }

        if(result != null) {
            println("Hasil: $result")
        } else {
            println("Operasi tidak valid.")
        }
    }

//}