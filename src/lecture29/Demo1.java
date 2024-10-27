package lecture29;

public class Demo1 {
    int accNo;
    String name;
    double balance;
    static String bankName;

    Demo1(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public Demo1() {
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        System.out.println(demo1.accNo);
        System.out.println(demo1.name);
        System.out.println(demo1.balance);
        Demo1 demo11 = new Demo1(11, "Riddhi", 5565545.5);
        System.out.println(demo11.accNo);
        System.out.println(demo11.balance);
        demo11.deposit(1000000);
        System.out.println(demo11.balance);
        System.out.println(demo11.name);

    }
}
