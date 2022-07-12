package AdapterPackage;

import java.util.ArrayDeque;
import java.util.Queue;

class Doctor {
    private String name;
    private String specialty;
    private boolean registered;
    private Queue<Patient> patients;

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.registered = true;
        this.patients = new ArrayDeque<>();
    }
    public String getName() {
        return name;
    }
    public String getSpecialty() {
        return specialty;
    }
    public boolean isRegistered() {
        return registered;
    }
    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }
    public int getPatientCount() {
        return this.patients.size();
    }
    public Patient removePatient(){
        return this.patients.remove();
    }
    @Override
    public String toString() {
        return "Doctor [name=" + name + ", patients=" + patients + ", registered=" + registered + ", specialty="
                + specialty + "]";
    }
}
