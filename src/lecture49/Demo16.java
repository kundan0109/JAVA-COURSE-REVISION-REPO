package lecture49;

public class Demo16 {
    public static void main(String[] args) {
        interface Function<Input, Output>{
            Output apply(Input input);
        }
        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("Kundan"));

        Function<Integer, Integer> function1 = n -> n*n;
        System.out.println(function1.apply(5));

        Function<String , String > function2 = str -> str;
        System.out.println(function2.apply("Kundan"));

        Function<String, Integer> metRef = String::length;
        System.out.println(function.apply("Kundan"));

    }
}
