

class Tablero {
    private val tablero = Array(3) { Array(3) { ' ' } }

    fun imprimirTablero() {
        println("\n  0 1 2")
        for (i in tablero.indices) {
            print("$i ")
            println(tablero[i].joinToString(" ") { it.toString() })
            if (i < 2) println("  -----")
        }
    }

    fun colocarFicha(fila: Int, columna: Int, simbolo: Char): Boolean {
        if (fila in 0..2 && columna in 0..2 && tablero[fila][columna] == ' ') {
            tablero[fila][columna] = simbolo
            return true
        }

        return false
    }

    fun verificarGanador(): Char? {
        for (i in 0..2) {

            /*Verificar primero si hay algún ganador en la primera fila, luego verificar si hay ganador en la segunda fila*/
            if (tablero[i][0] != ' ' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) return tablero[i][0]
            if (tablero[0][i] != ' ' && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) return tablero[0][i]
        }
        /*Verificar las diagonales*/
        if (tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) return tablero[0][0]
        if (tablero[0][2] != ' ' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) return tablero[0][2]


        return null
    }

    fun tableroLleno(): Boolean {
        for (fila in tablero) {
            for (celda in fila) {
                if (celda == ' ') {
                    return false
                }
            }
        }

        return true

    }

}