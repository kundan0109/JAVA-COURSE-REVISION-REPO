package lecture64_65_66;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        while (true) {
            int[] array = new int[1000000];
            list.add(array); // Keep a reference to the array
        }
    }
}

//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//	at Demo01.main(Demo01.java:8)