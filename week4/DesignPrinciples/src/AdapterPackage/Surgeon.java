package AdapterPackage;

public class Surgeon extends Doctor {
    public Surgeon(String name, String specialty) {
        super(name, specialty);
    }

    public void beginSurgery(String organ) {
        Patient patient = super.removePatient();
        System.out.println(super.getName() +" is now doing surgery on " + patient.getName() +"'s " + organ);

        System.out.println("Patient is now waiting for doctor availability for their post-op consultation.");
        super.addPatient(patient);
    }
}
