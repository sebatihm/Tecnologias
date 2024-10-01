class MenuBar:
    def paint(self):
        pass

class WinMenuBar(MenuBar):
    def paint(self):
        return "Renderizando barra de menu en windows"
    
class MacMenuBar(MenuBar):
    def paint(self):
        return "Renderizando barra de menu en Mac"