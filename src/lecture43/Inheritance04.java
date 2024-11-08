package lecture43;

public class Inheritance04 {
    public static void main(String[] args) {
        class A{

            int a1 = 100;
            int variable;
            void methodA(){
                System.out.println("instance method of A");
            }

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

            void methodAB (){
                System.out.println("B same method");
            }

        }

//        int n = 10;
//        Child child = new Parent();
//        in both the above sen they try to say LHS is of type RHS
//        like 10 is of type int so
//        parent is need to of type child.


//        Parent parent = new Child();
//        refrence is of type parent so if present only in child then not able to access.



    }
}
//43