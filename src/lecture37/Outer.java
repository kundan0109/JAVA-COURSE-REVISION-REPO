package lecture37;

class Outer {

    int a = 10;

    void m1() {
        System.out.println("Outer class m1 method");
    }

    class Inner {
        int b = 20;

        void m2() {
            System.out.println("Inner class m2 method");
        }
    }

    static class staticInner {
        int k = 22;
        static int s = 55;
        void m222(){
            System.out.println("instance method inside static");
        }

    }

    public static void main(String[] args) {
        class localInner {
        }
    }
}

class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.a);

        Outer.Inner inner = outer.new Inner();

        System.out.println(inner.b);
        inner.m2();

//        Outer.Inner Inner = new Outer.Inner();


        System.out.println(Outer.staticInner.s);

        Outer.staticInner ref = new Outer.staticInner();
        System.out.println(ref.k);
        ref.m222();

    }
}