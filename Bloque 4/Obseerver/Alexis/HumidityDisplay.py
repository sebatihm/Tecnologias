from Observer import Observer

class HumidityDisplay(Observer):

    def __init__(self):
        super().__init__()

    def update(self, subject):
        humidity = subject.get_humidity()

        if humidity < 50:
            print(f"HumidityDisplay: Advertencia, humedad Baja ({humidity}%)")
        else:
            print(f"HumidityDisplay: Nueva Humedad = {humidity}%")