package lecture39;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton=  Singleton.getInstance();
        Singleton singleton2=  Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton2);
    }
}
