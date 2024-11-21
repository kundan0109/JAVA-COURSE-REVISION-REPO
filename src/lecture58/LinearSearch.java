package lecture58;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5454, 87, 45, 978, 32};
        int x = -66;
        Arrays.sort(arr);
        boolean isFound = false;

        int left = 0;
        int right = arr.length - 1;
        int middle = (left + right) / 2;

        while (left <= right) {
            if (x == arr[middle]) {
                isFound = true;
                break;
            }
            if (x > arr[middle]) {
                left = middle + 1;
            }
            if (x < arr[middle]) {
                right = middle - 1;
            }
            middle = (left + right) / 2;

        }

        System.out.println(isFound ? "found" : "not found");

    }
}
