package lecture56_getClass_ToString_All4;

import lombok.*;


public class DeepCopy {

    public static void main(String[] args) throws CloneNotSupportedException {

        @AllArgsConstructor
        @ToString
        @NoArgsConstructor
        class Address implements Cloneable{
            int flatNo;
            String city;
            String Country;

            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
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
                Employee cloneEmployee = (Employee) super.clone();
                cloneEmployee.address = (Address) cloneEmployee.address.clone();
                return cloneEmployee;
            }
        }


        Address address = new Address(1, "Pune", "India");
        Employee employee = new Employee(1, "Kundan", 565555, address);
        employee.address.Country = "pak";
        System.out.println(employee);

//        Employee employee1 = new Employee(2, "nayan", 9898989, address);
        Employee employee2 = (Employee) employee.clone();
employee2.address.Country = "Singapour";
        System.out.println(employee2);

        System.out.println(
                employee.address
        );
        System.out.println(employee2.address);

        System.out.println(employee.address.hashCode());
        System.out.println(employee2.address.hashCode());
    }
}
