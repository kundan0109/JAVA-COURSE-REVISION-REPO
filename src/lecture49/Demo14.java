package lecture49;

public class Demo14 {
    public static void main(String[] args) {
        interface Consumer<X>{
            void accept(X input);
        }

        Consumer<String> consumer = input -> System.out.println(input);
        consumer.accept("Hello Ji");



    }
}
