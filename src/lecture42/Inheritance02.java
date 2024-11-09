package lecture42;

public class Inheritance02 {
    public static void main(String[] args) {
        class A{

            int a1 = 100;
            int variable;
            void methodA(){
                System.out.println("instance method of A");
            }
            int ab = 11;

            void methodAB (){
                System.out.println("A same method");
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

            int ab = 22;
            void methodAB (){
                System.out.println("B same method");
            }

        }

        B b = new B();
        System.out.println(b.ab);
        System.out.println(b.a1);
        System.out.println(b.b1);

        A a = new B();
        System.out.println(a.ab);
        a.methodAB();


    }
}
//43

//so in 3 rd present in both parent and child the method is override in child to add more functionality and write own logic
// but in case of variable you cannot write it again because you not want to add any more things or edit it.
//so if it is re written access it form parent.