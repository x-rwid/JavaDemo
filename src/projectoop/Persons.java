package projectoop;

public class Persons {

    private String name;
    private String address;

    public Persons(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Waxs[ism=" + name + ", manzil=" + address + "]";
    }
}
