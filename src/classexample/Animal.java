package classexample;

public class Animal {

    private static final String VET_CLINIC_ADDRESS = "Horizon 1/13";

    private String general;
    public String name;
    protected Integer age; // can use as package private and by inheritors
    String color; // package private, package access

    public String getGeneral() {
        return general;
    }
}
