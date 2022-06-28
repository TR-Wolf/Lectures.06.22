

public class InterfacesRealLife {
    public static void main(String[] args) {
        Door carDoor = new CarDoor();

    }
}
//---------DOOR-----------------
interface Door {
    void setLocked(boolean isLocked);
    void open();
    void close();
}

class CarDoor implements Door {

    @Override
    public void setLocked(boolean isLocked) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void open() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        
    }
    
}

class ClosetDoor implements Door {

    @Override
    public void setLocked(boolean isLocked) {
        // Do nothing, closet doors can't lock or unlock
        
    }

    @Override
    public void open() {
        // set the state to p
        
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        
    }
    // How do closet doors work?
}
//----------HVAC------------
interface HVAC {
    // What methods would go here?
}

class GeothermalHVAC implements HVAC {
    // How does geothermal work?
}

class GasFurnaceHVAC {
    // How does a gas furnace work?
}

//----------PIANO------------
interface Piano {
    // What methods would go here?
}

class ElectricKeyboard implements Piano {
    // How does an electric keyboard work?
}

class GrandPiano implements Piano {
    // How does a grand piano work?
}

