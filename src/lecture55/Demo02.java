package lecture55;

public class Demo02 {
    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
//        System.out.println(demo02.getClass());
        Class<? extends Demo02> reflectionConcept = demo02.getClass();// info about class

    }
}
