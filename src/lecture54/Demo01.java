package lecture54;

public class Demo01 {
    public static void main(String[] args) {
        interface Parent{
            void m1();
            void m2();
            default void m3(){
                System.out.println("Default Parent");
            }
        }

        class P implements Parent{

            @Override
            public void m1() {
                System.out.println("P 1");
            }

            @Override
            public void m2() {
                System.out.println("P 2");
            }

            @Override
            public void m3() {
                Parent.super.m3();
                            System.out.println("Default child P");
            }
        }

        Parent parent = new P();
        parent.m1();
        parent.m2();
        parent.m3();
    }
}
