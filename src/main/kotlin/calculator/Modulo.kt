package calculator

class Modulo(private val bilangan1: Double, private val bilangan2: Double) {
    fun hitung(): Double {
        return bilangan1 % bilangan2
    }
}