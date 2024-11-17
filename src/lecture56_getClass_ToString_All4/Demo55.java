package lecture56_getClass_ToString_All4;

import lombok.*;


public class Demo55 {

    public static void main(String[] args) throws CloneNotSupportedException {

        @AllArgsConstructor
        @ToString
        @NoArgsConstructor
        class Address {
            int flatNo;
            String city;
            String Country;
        }

        @AllArgsConstructor
        @ToString
        @NoArgsConstructor
        class Employee implements Cloneable {
            int id;
            String name;
            int salary;
            Address address;

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }


        Address address = new Address(1, "Pune", "India");
        Employee employee = new Employee(1, "Kundan", 565555, address);


        System.out.println(employee);

//        Employee employee1 = new Employee(2, "nayan", 9898989, address);
        Employee employee2 = (Employee) employee.clone();

        System.out.println(employee2);

        System.out.println(
                employee.address
        );
        System.out.println(employee2.address);
    }
}
