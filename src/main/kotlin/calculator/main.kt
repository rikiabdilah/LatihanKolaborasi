package calculator
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Masukkan bilangan pertama:")
    val bilangan1 = scanner.nextDouble()
    println("Masukkan bilangan kedua:")
    val bilangan2 = scanner.nextDouble()

    val pembagian = Pembagian(bilangan1, bilangan2)
    val hasilPembagian = pembagian.hitung()
    println("Hasil pembagian: $hasilPembagian")

    val pengurangan = Pengurangan(bilangan1, bilangan2)
    val hasilPengurangan = pengurangan.hitung()
    println("Hasil pengurangan: $hasilPengurangan")

    val perkalian = Perkalian(bilangan1, bilangan2)
    val hasilPerkalian = perkalian.hitung()
    println("Hasil perkalian: $hasilPerkalian")

    val penambahan = Penambahan(bilangan1, bilangan2)
    val hasilPenambahan = penambahan.hitung()
    println("Hasil penambahan: $hasilPenambahan")

    val modulo = Modulo(bilangan1, bilangan2)
    val hasilModulo = modulo.hitung()
    println("Hasil modulo: $hasilModulo")
}