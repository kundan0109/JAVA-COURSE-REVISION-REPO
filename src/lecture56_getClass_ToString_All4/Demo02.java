package lecture56_getClass_ToString_All4;

import lombok.*;


public class Demo02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        @NoArgsConstructor
        @AllArgsConstructor
        @ToString
        @EqualsAndHashCode

//        JAVA ONLY CLONE THE OBJECTS WHICH ARE MARKED AS TYPE CLONEABLE

        class Product implements Cloneable{
            private int id;
            private String name;

            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }
        Product product1 = new Product(1, "Mobole");
        Product product2 = product1;

        Product product3 = (Product) product1.clone();
        System.out.println(product1.hashCode());
        System.out.println(product3.hashCode());

    }
}
