package AdapterPackage;

public class Surgeon extends Doctor implements Comparable {
    private int organsRemoved;
    public Surgeon(String name, String specialty) {
        super(name, specialty);
        organsRemoved = 0;
    }

    public void beginSurgery(String organ) {
        Patient patient = super.removePatient();
        System.out.println(super.getName() +" is now doing surgery on " + patient.getName() +"'s " + organ);

        organsRemoved++;

        System.out.println("Patient is now waiting for doctor availability for their post-op consultation.");
        super.addPatient(patient);
    }

    @Override
    public int compareTo(Object o) {
        Surgeon s = (Surgeon) o;
        return s.getOrgansRemoved() - this.organsRemoved; // 20, 10 --> 10 (that surgeon has 10 more than me)
    }

    public int getOrgansRemoved() {
        return organsRemoved;
    }

    public void setOrgansRemoved(int organsRemoved) {
        this.organsRemoved = organsRemoved;
    }
}
