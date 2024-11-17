package lecture49;

import java.util.function.Predicate;

public class Demo12 {
    public static void main(String[] args) {
        class Worker implements Runnable{
            @Override
            public void run() {
                System.out.println("traditional runnable");
            }
        }



        class Workers implements Predicate{
            @Override
            public boolean test(Object object) {
                return false;
            }
        }
    }
}
