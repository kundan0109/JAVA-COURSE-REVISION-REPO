package lecture36;

public class Demo01 {

    int x = 1;
    int y = 1;
    static int z = 1;
    void method(){
        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.method();
        System.out.println(demo01.x);
        System.out.println(demo01.y);
        System.out.println(Demo01.z);
//        System.out.println(this.z);
    }
}
