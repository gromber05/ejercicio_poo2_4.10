

class Juego {
    private val tablero = Tablero()
    private val jugador1 = Jugador("Jugador 1", 'X')
    private val jugador2 = Jugador("Jugador 2", 'O')
    private var turno = jugador1

    fun jugar() {
        var ganador: Char? = null

        while (ganador == null && !tablero.tableroLleno()) {
            tablero.imprimirTablero()
            turno.realizarMovimiento(tablero)
            ganador = tablero.verificarGanador()
            turno = if (turno == jugador1) jugador2 else jugador1
        }

        tablero.imprimirTablero()
        println(if (ganador != null) "${if (ganador == 'X') jugador1.nombre else jugador2.nombre} es el ganador" else "Ha habido un empate")
    }
}