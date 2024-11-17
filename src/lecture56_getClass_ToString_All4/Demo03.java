package lecture56_getClass_ToString_All4;

import lombok.*;
@AllArgsConstructor
//@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode

public class Demo03 {
    public static void main(String[] args) throws CloneNotSupportedException {



        class Address {
            int flat;
            String city;
            String country;


            public Address(int i, String pune, String india) {
            }
        }
        class Emplo implements Cloneable {
            int id;
            String name;
            int salary;
            Address address;

            public Emplo(int i, String kundan, int i1, Address address) {
            }


            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        Address address = new Address(1, "Pune", "India");
        System.out.println(address);
        Emplo emplo = new Emplo(1, "Kundan", 200, address);
        System.out.println(emplo);

        Emplo emplo1 = (Emplo) emplo.clone();
        System.out.println(emplo1);
    }
}
