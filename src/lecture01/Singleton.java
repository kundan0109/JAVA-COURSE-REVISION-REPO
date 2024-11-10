package lecture01;

public class Singleton {
    private static Singleton instance;
    private Singleton(){
        System.out.println("Constructor Called");
    }
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void showMesssage(){
        System.out.println("Your instance");
    }
}

class SingletonTest{
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        singleton.showMesssage();
    }
}