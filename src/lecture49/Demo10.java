package lecture49;

public class Demo10 {
    public static void main(String[] args) {
        @FunctionalInterface
        interface A {
            public void m1();

        }
        class B implements A {
            @Override
            public void m1() {
                System.out.println("m1");
            }
        }
        A a = new B();
        a.m1();

        A a1 = new A() {
            @Override
            public void m1() {
                System.out.println("Anonymous");
            }
        };
        a1.m1();

        A a2 = () -> System.out.println("Lambds");
        a2.m1();



    }
}
