package lecture49_tough;

public class Suppliers {
    public static void main(String[] args) {

        interface Supplier<X> {
            X supply();
        }

        Supplier<String> supplier = () -> "Str return";
        Supplier<Integer> supplier1 = () -> 10;
        System.out.println(supplier.supply());
        System.out.println(supplier1.supply());
    }

}
