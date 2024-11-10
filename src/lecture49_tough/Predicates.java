package lecture49_tough;

public class Predicates {
    public static void main(String[] args) {
        @FunctionalInterface
        interface Predicate {
            boolean test(int num);
        }
        Predicate predicate = num -> num % 2 == 0;
        System.out.println(predicate.test(5));

    }
}
