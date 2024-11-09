package lecture42;

public class Inheritance01 {
    public static void main(String[] args) {
        class A{

            int a1 = 100;
            int variable;
            void methodA(){
                System.out.println("instance method of A");
            }
            A(){
                System.out.println("A constructor");
            }

        }


        class B extends A{
            int b1 = 200;
            void methodB(){
                System.out.println("instance method of B");
            }

        }

        A a = new A();
        System.out.println(a.a1);
        a.methodA();



    }
}
//43