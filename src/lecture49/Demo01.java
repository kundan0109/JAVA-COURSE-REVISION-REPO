package lecture49;

public class Demo01 {
    public static void main(String[] args) {
        interface Number{
            int process(int num);
        }
        Number square = num -> num*num;
        System.out.println(square.process(5));

        Number cube = num -> num*num*num;
        System.out.println(        cube.process(4));

    }

}
