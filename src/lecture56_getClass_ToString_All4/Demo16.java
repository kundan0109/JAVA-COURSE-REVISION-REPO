package lecture56_getClass_ToString_All4;

import lombok.*;

// Lombok's annotations work here as it's a top-level class
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
class Address {
    int flat;
    String city;
    String country;
}

class Emplo implements Cloneable {
    int id;
    String name;
    int salary;
    Address address;

    public Emplo(int id, String name, int salary, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Create a shallow copy
        Emplo cloned = (Emplo) super.clone();
        // Deep copy for the `Address` object
        cloned.address = new Address(this.address.flat, this.address.city, this.address.country);
        return cloned;
    }

    @Override
    public String toString() {
        return "Emplo{id=" + id + ", name='" + name + "', salary=" + salary + ", address=" + address + '}';
    }
}

public class Demo16 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address(1, "Pune", "India");
        System.out.println(address);

        Emplo emplo = new Emplo(1, "Kundan", 200, address);
        System.out.println(emplo);

        Emplo emplo1 = (Emplo) emplo.clone(); // Deep copy of Emplo
        System.out.println(emplo1);

        // Modify the cloned object's address and observe independence
        emplo1.address.city = "Mumbai";
        System.out.println("After modifying clone:");
        System.out.println("Original: " + emplo);
        System.out.println("Clone: " + emplo1);
    }
}
