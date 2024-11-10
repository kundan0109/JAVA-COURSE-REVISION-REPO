package lecture48;

public class Demo02 {
    public static void main(String[] args) {
        @FunctionalInterface
        interface A{
            void m1();
        }

        A lambda = () -> {
            System.out.println("Lambda Way");
        };
        lambda.m1();

    }
}
