from WinFactory import *
from MacFactory import *

def create_gui(factory,usuario,task_name):
    MenuBar = factory.create_menuBar()
    Session = factory.create_session()
    Driver = factory.create_drivers()
    
    Session.set_usuario(usuario)
    
    return MenuBar.paint(), Session.show_usuario(),[Driver.check_status for Driver in Driver]

if __name__ == "__Main__":
    print("\nInterfaz de Windows: ")
    win_factory = WinFactory()
    win_menuBar, win_session, win_drivers = create_gui(win_factory, "Alexis Nava", "Issac")
    print(win_session) 
    print(win_menuBar) 
    print(win_drivers)
    
    for driver_status in win_drivers:
        print(driver_status)  
        
    print("\nInterfaz de Mac OS: ")
    mac_factory = MacFactory()
    mac_menuBar, mac_session, mac_drivers = create_gui(mac_factory, "Cmastian", "Issac")
    print(mac_session) 
    print(mac_menuBar) 
    print(mac_drivers)
    
    for driver_status in win_drivers:
        print(driver_status)  