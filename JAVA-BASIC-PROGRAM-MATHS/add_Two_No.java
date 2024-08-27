
import java.util.Scanner;

public class add_Two_No {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENter first numbers");
        int n1 = scanner.nextInt();
        System.out.println("ENter first numbers");
        int n2 = scanner.nextInt();
        int s = n1 + n2;

        System.out.printf("your sum is " );
        System.out.println(s);
    }
}