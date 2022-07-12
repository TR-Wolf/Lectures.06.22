package AdapterPackage;

public class Patient {
    private String name;
    private String need;
    public Patient(String name, String need) {
        this.name = name;
        this.need = need;
    }
    public String getName() {
        return name;
    }
    public String getNeed() {
        return need;
    }
    @Override
    public String toString() {
        return this.name;
    }
}