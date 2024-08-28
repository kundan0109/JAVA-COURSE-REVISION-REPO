package object_class_methods;

public class defaultMethod01 {
    public static void main(String[] args) {

        interface A {
            void m1();

            void m2();

            default void m3() {
                System.out.println("DEFAULT METHOD OF INTERFACE");
            }

            // IF i add any new method in parent interface then I need to override it to subclasses also


            // SO they introduce a new default method
            // backward compatibility

        }


        class B implements A {

            @Override
            public void m1() {
                System.out.println("A : override m1 ");
            }

            @Override
            public void m2() {
                System.out.println("A : override m1 ");
            }
            public void m3(){
                A.super.m3();
                System.out.println("class B default method");
            }
        }

        class C implements A {

            @Override
            public void m1() {
               System.out.println("B : override m1 ");
            }

            @Override
            public void m2() {
                System.out.println("B : override m2 ");}
            public void m3(){
                A.super.m3();
                System.out.println("class C default method");
            }
        }

        A a = new B();
        a.m1();
        a.m2();
        a.m3();

        A a1 = new C();
        a1.m1();
        a1.m2();
        a1.m3();


    }
}
