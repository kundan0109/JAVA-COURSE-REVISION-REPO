package lecture56_getClass_ToString_All4;

public class Demo01 {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize ");
    }

    public static void main(String[] args) {

        Demo01 demo01 = new Demo01();
        demo01 = null;
        System.gc();
        System.out.println("Rest of main");

    }
}
