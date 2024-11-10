package lecture49;

public class Generics {
    public static void main(String[] args) {
        @FunctionalInterface
        interface Predicate<X> {
            boolean test(X input);
        }
        Predicate<Integer> predicate = num -> num % 2 == 0;
        Predicate<String> predicate1 = num -> num.startsWith("A");
        System.out.println(predicate.test(5));
        System.out.println(predicate1.test("Anushka"));


//         GENERIC USE TO INPUT ANY TYPE OF DATA AS A INPUT
//        BUT PREDICATE MADE IT TO HAVE ONLY BOOLEAN RETURN
    }
}
