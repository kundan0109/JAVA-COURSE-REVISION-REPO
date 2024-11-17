package lecture49;

public class Demo13 {
    public static void main(String[] args) {
        interface Predicate<X> {
            boolean test(X input);
        }

        Predicate<Integer> predicate = number -> number % 2 == 0;

        System.out.println(predicate.test(6));

        Predicate<String> predicate1 = str -> str.startsWith("A");
        System.out.println(predicate1.test("Kundan"));
    }
}
