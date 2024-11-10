package lecture49_tough;

public class MethodRef {
    public static void main(String[] args) {

        interface NumProcess {
            int add(int n1, int n2);


        }


        NumProcess numProcess = Integer::sum;

        System.out.println(numProcess.add(5, 6));


        class Integerses {
            static int sum2(int a, int b) {
                return a + b;
            }

            public int sum3(int a, int b ) {
                return a + b ;
            }


        }

        NumProcess integerses = Integerses::sum2;
        NumProcess integerses2 = new Integerses()::sum3;

        System.out.println(integerses.add(5,66));
        System.out.println(integerses2.add(55, 4));
    }
}
