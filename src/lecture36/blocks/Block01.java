package lecture36.blocks;

public class Block01 {

    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        Block01 block01 = new Block01();
        System.out.println("main merhod");

    }

}
