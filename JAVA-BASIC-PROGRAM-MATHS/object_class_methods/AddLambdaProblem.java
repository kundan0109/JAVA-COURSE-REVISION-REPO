package object_class_methods;

public class AddLambdaProblem {
    public static void main(String[] args) {

        interface First {
            void add(int a, int b);
        }

        First first = (a, b) -> System.out.println(a + b);
        first.add(5, 6);


    }
}
