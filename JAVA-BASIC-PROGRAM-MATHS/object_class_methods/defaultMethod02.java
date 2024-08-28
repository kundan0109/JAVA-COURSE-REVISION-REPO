package object_class_methods;


//  multiple inheritance in interface

public interface defaultMethod02 {
    public static void main(String[] args) {
        interface A {
            default void m1() {
                System.out.println("default method A ");
            }
        }

        interface B {
            default void m1() {
                System.out.println("default method B ");
            }
        }

        class C implements A, B {
            @Override
            public void m1() {
                A.super.m1();
                B.super.m1();
                System.out.println("child default method");
            }
            // to resolve ambiguity
        }

        A a = new C();
        a.m1();

    }
}
