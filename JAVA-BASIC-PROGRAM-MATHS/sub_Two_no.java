import java.util.Scanner;

public class sub_Two_no {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first numbers");
        int n1 = scanner.nextInt();
        System.out.println("Enter first numbers");
        int n2 = scanner.nextInt();
        int s = n1 - n2;

        System.out.printf("your subtraction is " );
        System.out.println(s);
    }
}
