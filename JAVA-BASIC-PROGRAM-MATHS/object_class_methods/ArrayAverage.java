package object_class_methods;

public class ArrayAverage {
    public static void main(String[] args) {
        interface First {
            void m1(int[] myArray);
        }


        First first = (myArray) -> {

            int sum = 0;

            for (int i = 0; i < myArray.length; i++) {
                sum = sum + myArray[i];
            }

            System.out.println("Your average is :");
            System.out.println(sum / myArray.length);
        };


        int[] myArray = {1, 2, 3, 4, 5};
        first.m1(myArray);


    }
}
