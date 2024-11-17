package lecture55;

public class Demo04 {
    public static void main(String[] args) {

        class Student{
            int a ;
            void m1(){
                System.out.println("m1");
            }
        }

        Student student = new Student();

        System.out.println(Integer.toHexString(student.hashCode()));
        System.out.println(student.getClass().getName()+ "@" + Integer.toHexString(student.hashCode()));
        System.out.println(student.toString());
    }
}
