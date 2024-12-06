from Subject import WeatherStation
from TemperatureDisplay import TemperatureDisplay
from HumidityDisplay import HumidityDisplay

if __name__ == "__main__":
    weather_station = WeatherStation()

    temp_display = TemperatureDisplay()
    humidity_display = HumidityDisplay()

    weather_station.attach(temp_display)
    weather_station.attach(humidity_display)

    print("Actializacion 1:")
    weather_station.set_measurements(25,62)

    print("Actualizacion 2:")
    weather_station.set_measurements(35,55)

    print("\n Desactivando Temperatura....")
    temp_display.desactivate()

    print("\nActualizacion 3:")
    weather_station.set_measurements(28,45)

    print("\nHistorial de medidas:")

    for i, (t,h) in enumerate(weather_station.get_history(),1):
        print(f"{i}, Temperatura: {t}ºC, Humedad: {h}%")