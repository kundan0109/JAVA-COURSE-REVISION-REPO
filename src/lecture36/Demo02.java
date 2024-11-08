package lecture36;

public class Demo02 {
    int id;
    String name;
    int price;

    Demo02(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        System.out.println(this.id + this.name + this.price);
        System.out.println("Paremeterized");
    }

    Demo02() {
        System.out.println("Zero Called");
    }

    Demo02(Demo02 demo02) {
        this.id = demo02.id;
        this.name = demo02.name;
        this.price = demo02.price;
        System.out.println(this.id + this.name + this.price);
        System.out.println("Copy Constructor");
    }


    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        Demo02 demo002 = new Demo02(11, "kundan", 65565);
        Demo02 demo021 = new Demo02(demo002);

    }

}
