package lecture46;

public class Demo02 {
    public static void main(String[] args) {

        class A {
            int x = 1;
            int y = 2;
            int z = 3;
        }

        class B extends A {

            int x = 10;
            int y = 20;
            int z = 30;

            void m1() {
                int x = 100;
                int y = 200;
                int z = 300;
                System.out.println("Access all parent");
                System.out.println(super.x);
                System.out.println(super.y);
                System.out.println(super.z);
                System.out.println(this.x);
                System.out.println("Access all child");
                System.out.println(this.x);
                System.out.println(this.y);
                System.out.println(this.z);
                System.out.println("Access all method");
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
            }
        }
        B b = new B();
        b.m1();
    }

}
