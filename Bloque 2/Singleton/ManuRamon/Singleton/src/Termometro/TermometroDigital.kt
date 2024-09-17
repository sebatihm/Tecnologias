package Termometro

import TempHabitacion.TempHabitacion

class TermometroDigital : Termometro{
    override fun leerTemp(tempActual: TempHabitacion): Double {
        return tempActual.getTempActual()
    }

    override fun mostrarTemp(tempActual: TempHabitacion) {
        println("""
            
            La temperatura actual es: ${tempActual.getTempActual()}
            
        """.trimIndent())
    }
}