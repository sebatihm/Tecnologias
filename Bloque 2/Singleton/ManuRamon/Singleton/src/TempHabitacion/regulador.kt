package TempHabitacion

import Calentador.Calentador
import Termometro.Termometro

class regulador private constructor() {
    private var maxTemp: Double= 0.0
    private var minTemp: Double= 0.0

    companion object {
        private var instance: regulador? = null

        fun getInstance(): regulador {
            if (instance == null) {
                instance = regulador()
            }
            return instance!!
        }
    }

    fun setMaxTemp(maxTemp: Double) {
        this.maxTemp = maxTemp
    }

    fun setMinTemp(minTemp: Double) {
        this.minTemp = minTemp
    }

    fun getMaxTemp(): Double {
        return maxTemp
    }

    fun getMinTemp(): Double {
        return minTemp
    }

    fun tempPromedio(maxTemp: Double,minTemp: Double): Double {
        return (maxTemp + minTemp)/2
    }

    fun calibrarTemp(termometro: Termometro, tempActual: TempHabitacion) {
        if (termometro.leerTemp(tempActual) > maxTemp || termometro.leerTemp(tempActual) < minTemp) {
            println("""
                
                (!) TEMPERATURA FUERA DEL RANGO (!)
                
                Calibrando...
                Temperatura reestableida a: ${tempPromedio(maxTemp, minTemp)}
                
            """.trimIndent())

            tempActual.setTempActual(tempPromedio(maxTemp, minTemp))
        }else{
            println("""
                
                Temperatura dentro de rango permitido, no hay nada que hacer.
                
                
            """.trimIndent())
        }
    }
}