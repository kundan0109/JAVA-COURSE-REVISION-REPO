package lecture64_65_66;

public class Demo {
    public static void main(String[] args) {

        try {
            try {
                System.out.println(10 / 0);
            }
            finally {
                System.out.println(" 01 child finally");
            }
            System.out.println("02 child try complete ");
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("03 Catch block parent");
        }
        finally {
            System.out.println("04 finally parent");
        }
        System.out.println("05 rest of main");



    }
}
