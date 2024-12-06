class Observer:
    def __init__(self):
        self.is_activate = True

    def update(self,subject):
        pass

    def activate(self):
        self.is_activate = True

    
    def desactivate(self):
        self.is_activate = False