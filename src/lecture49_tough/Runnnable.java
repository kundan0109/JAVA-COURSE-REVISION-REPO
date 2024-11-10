package lecture49_tough;

public class Runnnable {
    public static void main(String[] args) {

        class B implements Runnable {
            @Override
            public void run() {
                System.out.println("Implement using Traditional");
            }
        }
        Runnable runnable1 = new B();
        runnable1.run();


        Runnable runnable3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Impl using Anonymuos");
            }
        };
        runnable3.run();

        Runnable runnable = () -> {
            System.out.println("Runnable impl using lambda");
        };
        runnable.run();


    }
}
