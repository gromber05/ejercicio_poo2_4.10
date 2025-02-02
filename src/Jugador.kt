

class Jugador(val nombre: String, val ficha: Char) {

    fun realizarMovimiento(tablero: Tablero) {
        var fila: Int
        var columna: Int

        do {
            print("$nombre ($ficha), introduce fila y columna (ej. 1 2): ")
            val entrada = readln().split(" ")
            fila = entrada[0].toIntOrNull() ?: -1
            columna = entrada[1].toIntOrNull() ?: -1

        } while (!tablero.colocarFicha(fila, columna, ficha))

    }
}
