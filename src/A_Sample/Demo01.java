package A_Sample;

public class Demo01 {
    public static void main(String[] args) {
        class RunnableImpl implements Runnable{

            @Override
            public void run() {
                System.out.println("Traditional Runnable");
            }
        }
        RunnableImpl runnable = new RunnableImpl();
        runnable.run();

        Runnable runnable1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("Anonymous Runnable");
            }
        };
        runnable1.run();

        Runnable runnable2 = () -> {
            System.out.println("Runnable lambda");
        };
        runnable2.run();


    }
}
