package AdapterPackage;

public class Surgeon extends Doctor {
    public Surgeon(String name, String specialty) {
        super(name, specialty);
    }

    public void beginSurgery() {
        Patient victim = super.removePatient();
//        victim.removeOrgans();
    }
}
