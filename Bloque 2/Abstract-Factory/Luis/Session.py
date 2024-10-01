class Session:
    def __init__(self):
        self.usuario = ""
    
    def set_usuario(self,nombre):
        self.usuario = nombre
    
    def show_usuario(self):
        pass

class WinSession(Session):
    def show_usuario(self):
        return f"Sesion iniciada con: {self.usuario} en windows"
    
class MacSession(Session):
    def show_usuario(self):
        return f"Sesion iniciada con: {self.usuario} en MacOS"