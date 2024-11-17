package lecture55;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class Demo01 {
    private  int id;
    private String name;
    private int age;

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01(11, "Kundan", 23);
        System.out.println(demo01);
    }
}
