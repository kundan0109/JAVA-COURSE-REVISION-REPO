package lecture54;

public interface Demo02 {
    public static void main(String[] args) {
        class Student{
            int id;
            String name;
            Student(int id, String name){
                this.id = id;
                this.name = name;
            }
        }
        Student student = new Student(11, "Kundan");
        Student student2 = new Student(12, "Suraj");
        System.out.println(student.hashCode());
//        student2 = student;
        System.out.println(student2.hashCode());

    }
}
