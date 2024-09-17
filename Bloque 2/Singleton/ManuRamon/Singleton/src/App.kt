import Calentador.*
import TempHabitacion.*
import Termometro.*
import UI.Menu
import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)
    var tempActual: TempHabitacion = TempHabitacion.getInstance()
    var calentador:Calentador =CalentadorGas()
    var termometro: Termometro = TermometroDigital()
    var Regulador: regulador = regulador.getInstance()

    Regulador.setMaxTemp(38.5)
    Regulador.setMinTemp(17.5)
    tempActual.setTempActual(29.5)

    val menu = Menu()
    menu.mostrarMenu()
}