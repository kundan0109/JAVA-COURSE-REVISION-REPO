package lecture54_tough;

public class Demo03 {
    public static void main(String[] args) {
        class Student{
            int id;
            String name;
            Student(int id, String name){
                this.id = id;
                this.name = name;
            }
        }

        Student student = new Student(111, "Kundan");
        Student student2 = new Student(111, "Kundan");
        Student student3 = new Student(111, "Kundan");

        System.out.println(student == student2);


    }
}
