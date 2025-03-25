package Acuario

class Acuario(largo: Int = 100, ancho: Int = 20, alto: Int = 40) {
    var largo: Int = largo
    var ancho: Int = ancho
    var alto: Int = alto


    fun imprimirTamano() {
        println(
            "Ancho: $ancho cm " +
                    "Largo: $largo cm " +
                    "Alto: $alto cm "
        )
    }

    init {
        println("inicializando acuario")
    }

    init {
        // 1 litro = 1000 cm^3
        println("Volumen: ${ancho * largo * alto / 1000} l")

    }
}



