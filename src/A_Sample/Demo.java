package A_Sample;

public class Demo {
    public static void main(String[] args) {

        int num = 5;
        for (int row = num; row > 0; row--) {
            for (int space = num / 2  ; space > 0 ; space--) {
                System.out.print(" ");
            }

            for (int star = 0; star < 5-num; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
