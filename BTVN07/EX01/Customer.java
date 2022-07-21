package BTVN07.EX01;

/**
 * Customer
 */
public class Customer {

    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return address;
    }

    public void setCity(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer Name: " + name + " Address: " + address;
    }
}