package lecture48;

public class Demo01 {
    public static void main(String[] args) {

        interface A {
            void m1();
        }
        A anom = new A(){
            public void m1(){
                System.out.println("Anonymous way");
            }
        };
        anom.m1();

        A lamb = () -> {
            System.out.println("Lambda Way");
        };
        lamb.m1();
    }



}
