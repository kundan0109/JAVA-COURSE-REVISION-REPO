package lecture49;

public class Demo17 {
    public static void main(String[] args) {
        interface NumberProcessor{
            int add (int n1 , int n2);
        }

        class Integer{
            int sum(int n1, int n2){
                return n1 + n2;
            }

        }

        NumberProcessor numberProcessor =new  Integer() :: sum;
        System.out.println(numberProcessor.add(5, 6));
    }
}
