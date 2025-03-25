package acuario
import Acuario.Acuario

fun construirAcuario() {
    val acuario6 = Acuario(numeroDePeces = 29)
    acuario6.imprimirTamano()
    println("Volumen: ${acuario6.ancho * acuario6.largo * acuario6.alto / 1000} l")
}

fun main() {
    construirAcuario()

}
