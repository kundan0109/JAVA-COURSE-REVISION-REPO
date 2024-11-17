package lecture56_getClass_ToString_All4;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Demo45 {
    int id;
    String name;
    public static void main(String[] args) {

        Demo45 demo45 = new Demo45(1, "Kundan");
        System.out.println(demo45.getClass().getName());

    }

}
