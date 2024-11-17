package lecture49;

import java.util.function.Supplier;

public class Demo15 {
    public static void main(String[] args) {
//        @FunctionalInterface
//        interface Supplier<X>{
//            X get();
//        }
        Supplier<String> supplier = () -> "String Return";
        Supplier<Integer> supplier1 = () -> 5;
        System.out.println(supplier.get());
        System.out.println(supplier1.get());


//        PREDICATE return boolean method test accept any
//        CONSUMER accept any return nothing method consume
//        SUPPLIER  accept nothing provide something method get
    }
}
