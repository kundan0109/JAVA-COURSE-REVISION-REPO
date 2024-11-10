package lecture50_51_53;

public class Demo01 {
    public static void main(String[] args) {
        interface A {
            void m1();

        }
        class B {
            B() {
                System.out.println("B constructor");
            }

            void m2(){
                System.out.println("class b instance");
            }

            static void m3(){
                System.out.println("M3 Static method");
            }

        }
        A a = () -> System.out.println("Test");
        a.m1();

        A a1 = B ::new;
        a1.m1();
        B b = new B();
        A a2 = b::m2;
        a2.m1();

        A a3 = B ::m3;
        a3.m1();


    }
}
