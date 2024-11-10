package lecture49_tough;

public class Functions {
    public static void main(String[] args) {
        @FunctionalInterface
        interface Function<T, R> {
            R apply(T t);
        }

        Function<String, Integer> function = str -> str.length();
        System.out.println("length is " + function.apply("Samay"));


        Function<Integer, Integer> function1 = num -> num*num;
        System.out.println("Square is  " + function1.apply(5));


        Function<String, Integer> function4 = String::length;
        System.out.println("length is " + function4.apply("Samay"));
    }
}
