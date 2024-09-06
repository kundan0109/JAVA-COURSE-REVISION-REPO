package object_class_methods;

public class FirstCharString {
    public static void main(String[] args) {

        interface First {

            void m1(String name);

        }

        First first = (name -> {
            System.out.println(name.charAt(0));
        });

        first.m1("Kundan");

    }
}
