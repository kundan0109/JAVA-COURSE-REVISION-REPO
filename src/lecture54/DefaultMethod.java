package lecture54;

public class DefaultMethod {
    public static void main(String[] args) {
        interface A{
            default void m1(){
                System.out.println("A m1");
            }
        }
        interface B {
            default void m1(){
                System.out.println("B m1");
            }
        }

        class C implements A,B{
            @Override
            public void m1() {
                A.super.m1();
                B.super.m1();
                System.out.println("Overriden child C");
            }
        }
        C c = new C();
        c.m1();

    }
}
