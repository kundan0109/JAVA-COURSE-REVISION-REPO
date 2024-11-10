package lecture01;

// Step 1: Declare the class as final to prevent subclassing
public final class Person {
    // Step 2: Make all fields private and final
    private final String name;
    private final int age;
    private final Address address;  // mutable object

    // Step 4: Initialize fields via constructor
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;

        // Create a defensive copy of the mutable object
        this.address = new Address(address.getStreet(), address.getCity());
    }

    // Step 3: No setters provided

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Step 5: Return a defensive copy of the mutable object
    public Address getAddress() {
        return new Address(address.getStreet(), address.getCity());
    }
}

// Mutable class Address
class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
