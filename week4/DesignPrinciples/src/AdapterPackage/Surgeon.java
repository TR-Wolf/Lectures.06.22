package AdapterPackage;

public class Surgeon implements canDoSurgery {
    //Right here, I am adapting a doctor into my Surgeon Class.
    private Doctor basicDoctor;

    public Surgeon(String name, String specialty) {
        basicDoctor = new Doctor(name, specialty);
    }

    @Override
    public void beginSurgery(String organ) {
        Patient patient = basicDoctor.removePatient();
        System.out.println(basicDoctor.getName() +" is now doing surgery on " + patient.getName() +"'s " + organ);

        System.out.println("Patient is now waiting for doctor availability for their post-op consultation.");
        basicDoctor.addPatient(patient);
    }

    public void postOperationConsultation(){
        basicDoctor.removePatient();
    }
}
