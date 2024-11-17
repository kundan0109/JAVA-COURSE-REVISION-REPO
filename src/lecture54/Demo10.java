package lecture54;

public class Demo10 {
    public static void main(String[] args) {
        class Student{
            int id;
            String name;
        }

        Student student = new Student();
        System.out.println(student.hashCode());

    }
}
