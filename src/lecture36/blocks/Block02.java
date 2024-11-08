package lecture36.blocks;


class Bl1 {
    int age;
    String name;

    Bl1() {
        System.out.println("PArent Constructor");
    }
    Bl1(int age, String name) {
        System.out.println("PArent 2  Constructor" + age+ name);
    }
    {
        System.out.println("PArent Instance Block");
    }
}

class Block02 extends Bl1 {
    static {
        System.out.println("static block");
    }

    {
        System.out.println("Instance Block");
    }

    Block02() {
        super(11, "kundna");
        System.out.println("Constructor call");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        Block02 block02 = new Block02();

    }
}
