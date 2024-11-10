package lecture54_tough;

import java.util.Objects;

public class Demo05 {
    public static void main(String[] args) {
        class Student{
            int id;
            String name;
            Student(int id, String name){
                this.id = id;
                this.name = name;
            }

            public boolean equals(Object object){
//                Handleing null object
                if (object == null){
                    return false;
                }
//                Handling Other type of object

                if (!(object instanceof Student)){
                    return false;
                }
//                Type casting
                Student student = (Student) object;
                return this.id == student.id;
            }


            @Override
            public int hashCode() {
                return Objects.hashCode(this.id);  // Objects Utility class contain static hashcode method
            }
        }
        Student student = new Student(111, "Kundan");
        Student student2 = new Student(111, "Kundan");
        Student student3 = new Student(111, "Kundan");


        System.out.println(student.equals(student2));
        System.out.println(student.equals(null));// Null check
        System.out.println(student.equals(null)); // prod  type check

        System.out.println(student.hashCode());

    }
}
