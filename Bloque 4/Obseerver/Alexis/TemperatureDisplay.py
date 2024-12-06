from Observer import Observer

class TemperatureDisplay(Observer):
    def __init__(self):
        super().__init__()

    def update(self,subject):
        temperature = subject.get_temperature()
        if temperature > 30:
            print(f"TemperatureDisplay: ALERTA, hace calor ({temperature} ªC)")
        else:
            print(f"TemperatureDisplat: NuevaTemperatura = {temperature} ºC")

    

