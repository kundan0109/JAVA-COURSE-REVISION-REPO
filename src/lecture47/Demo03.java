package lecture47;

public class Demo03 {
    public static void main(String[] args) {
        @FunctionalInterface
        interface A{
            void m1();

        }

        A a = new A(){
            @Override
            public void m1() {
                System.out.println("Anonymous");
            }
        };
        a.m1();

        A lambda = () -> System.out.println("Lambda Exp");
        lambda.m1();


    }
}
