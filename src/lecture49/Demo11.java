package lecture49;

public class Demo11 {
    public static void main(String[] args) {
        interface A{
            int process(int n);
        }
        A square = n -> n*n;
        System.out.println(square.process(5));
        A cube = n -> n*n*n;
        System.out.println(cube.process(5));
    }
}
