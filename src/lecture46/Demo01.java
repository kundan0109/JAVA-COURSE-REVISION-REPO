package lecture46;

public class Demo01 {
    public static void main(String[] args) {

        abstract class A {
            int x = 1;
            int y = 2;
            int z = 3;

            abstract void m1();

            A() {
                System.out.println("A constructor");
            }
        }

        class B extends A {

            int a = 10;
            int b = 20;
            int c = 30;

            @Override
            void m1() {
                int p = 100;
                int q = 200;
                int r = 300;
                System.out.println("m1 Overridden in B");
                System.out.println("Access all parent");
                System.out.println(super.x);
                System.out.println(super.y);
                System.out.println(super.z);
                System.out.println(this.x);
                System.out.println("Access all child");
                System.out.println(this.a);
                System.out.println(this.b);
                System.out.println(this.c);
                System.out.println("Access all method");
                System.out.println(p);
                System.out.println(q);
                System.out.println(r);
            }

            B() {
                System.out.println("COnstructor of B");
            }
        }

        A a = new B();
        a.m1();


    }

}
