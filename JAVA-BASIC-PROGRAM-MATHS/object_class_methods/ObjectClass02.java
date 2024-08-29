package object_class_methods;

//  toString, getClass, hashCode, equals, notify, clone, wait, wait, wait, notifyAll, finalize, 11 methods
//  Object class--> cosmic class,
//  native -- non java
//  == checks the content whether primitive or refrence
//  equals checks only refrence


import java.util.Objects;

public class ObjectClass02 {
    public static void main(String[] args) {

        class Product{
            int id;
            String name;

            public Product(int id, String name) {
                this.id = id;
                this.name = name;
            }

            @Override
            public boolean equals(Object object) {
                if (this == object) return true;
                if (object == null || getClass() != object.getClass()) return false;
                Product product = (Product) object;
                return id == product.id && Objects.equals(name, product.name);
            }

            @Override
            public int hashCode() {
                return Objects.hashCode(id);
            }
        }

        Product product1 = new Product(1, "laptop");
        Product product2 = new Product(1, "laptop");
        Product product3 = new Product(1, "laptop");

        System.out.println(product1 == product2);
        System.out.println(product2 == product3);
        System.out.println(product1 == product3);

        System.out.println(product1.equals(product2));
        System.out.println(product2.equals(product3));
        System.out.println(product1.equals(product3));


        System.out.println("See equals method: ");
        System.out.println(product1.equals(product1));
        System.out.println(product1.equals(product2));
    }

}

