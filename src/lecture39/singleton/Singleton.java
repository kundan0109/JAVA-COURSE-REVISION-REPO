package lecture39.singleton;

class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Creating singleton");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
