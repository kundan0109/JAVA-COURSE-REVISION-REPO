package lecture54;

public class Demo06 {
    public static void main(String[] args) {
        interface A {
            default void m1() {
                System.out.println("A");
            }
        }
        interface B {
            default void m1() {
                System.out.println("B");
            }
        }

        class C implements A, B {
            //            public void m1() {
//                A.super.m1();
//            }
//            public void m1(){
//                B.super.m1();
//            }
            public void m1() {
                System.out.println("C class m1 call");
            }
        }
        C c = new C();
        c.m1();
    }
}
