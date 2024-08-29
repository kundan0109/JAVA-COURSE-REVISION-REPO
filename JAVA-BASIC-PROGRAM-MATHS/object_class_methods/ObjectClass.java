package object_class_methods;

//  toString, getClass, hashCode, equals, notify, clone, wait, wait, wait, notifyAll, finalize, 11 methods
//  Object class--> cosmic class,
//  native -- non java
//  == checks the content whether primitive or refrence
//  equals checks only refrence




public class ObjectClass {
    public static void main(String[] args) {

        class Product{
            int id;
            String name;

            public Product(int id, String name) {
                this.id = id;
                this.name = name;
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

    }

}

