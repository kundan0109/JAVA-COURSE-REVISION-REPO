package lecture47;

public class LifeCycleEngineer {

    public static void main(String[] args) {
        class A{
            void m2(){
                System.out.println("Parent");
            }
            int k = 44;
            void m1(){}
        }
        A ref = new A(){
            int k = 55;
          void m1(){
              System.out.println("anonymous");
          }
        };

        ref.m2();
        ref.m1();
        System.out.println(ref.k);
    }

}
