package lecture57;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 7};
//        System.out.println(arr[1]);


        int[] arr2 ;
         arr2 = new int[]{66, 8, 99, 51, 66, 5, 5};

         int max = Integer.MIN_VALUE;
         int secMax = max;


        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > max){
                secMax = max;
                max = arr2[i];
            }
        }
        System.out.println("maximum " + secMax);

        int min = Integer.MAX_VALUE;
        int secondMin = min;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < min){
                secondMin = min;
                min = arr2[i];
            }
        }
        System.out.println("minimum " + secondMin);

    }
}
