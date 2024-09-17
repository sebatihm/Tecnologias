package UI

import Calentador.*
import TempHabitacion.*
import Termometro.*
import java.util.Scanner
class Menu {
    val input = Scanner(System.`in`)
    var tempActual: TempHabitacion = TempHabitacion.getInstance()
    var calentador:Calentador =CalentadorGas()
    var termometro: Termometro = TermometroDigital()
    private val Regulador: regulador = regulador.getInstance()

    fun mostrarMenu(){
        var continuar = true
        while (continuar) {
            println("""
                .::Sistema de calefacción::.
                -----------------------------
                Temp, Actual: ${tempActual.getTempActual()}
                MTemp, max: ${Regulador.getMaxTemp()} | Temp. Min: ${Regulador.getMinTemp()}
                -----------------------------
                (i) Seleccione una opción:
                1.- Interfaz calentador
                2.- Revisar termometro
                3.- Calibrar temperatura
                0.- Salir 
                
            """.trimIndent())
            when(input.nextInt()){
                1 -> {
                    calentador.ajustarTemp(tempActual)
                }
                2 -> {
                    termometro.mostrarTemp(tempActual)
                }
                3 -> {
                    Regulador.calibrarTemp(termometro, tempActual)
                }
                0 -> {
                    println("Saliendo del sistema")
                    continuar = false
                }
                else -> {
                    println("Opción no válida, intente nuevamente")
                }

            }
        }
        input.close()
    }
}