package object_class_methods;

public class equalsMethod {
    public static void main(String[] args) {

        class student{
            int id;
            String name ;

            student(int id, String name){
                this.id = id;
                this.name = name;
            }
        }

        student student = new student( 101, "kundan");
        student student1 = new student( 101, "kundan");
        student student2 = new student( 101, "kundan");
        student student3 = student;

        System.out.println(student == student1);
        System.out.println(student1 == student2);
        System.out.println(student2 == student);
        System.out.println(student3 == student);


    }
}
