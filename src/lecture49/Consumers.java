package lecture49;

public class Consumers {

    public static void main(String[] args) {

        interface Consumer<X>{
            void accept(X input);
        }

        Consumer<String> stringConsumer = input -> System.out.println(input);
        Consumer<Integer> intConsumer = input -> System.out.println(input);
        stringConsumer.accept("kundan");
        intConsumer.accept(55);
    }
}
