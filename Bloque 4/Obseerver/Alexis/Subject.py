class WeatherStation:
    def __init__(self):
        self._observers = []
        self._temperature = None
        self._humidity = None
        self._history = []

    def attach(self,observer):
        self._observers.append(observer)
    
    def detach(self,observer):
        self._observers.remove(observer)

    def notify(self):
        for observer in self._observers:
            if observer.is_activate:
                observer.update(self)
    
    def set_measurements(self,tempeture,humidity):
        self._temperature = tempeture
        self._humidity = humidity
        self._history.append((tempeture,humidity))
        self.notify()

    def get_temperature(self):
        return self._temperature
    
    def get_humidity(self):
        return self._humidity
    
    def get_history(self):
        return self._history
    