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
    }





