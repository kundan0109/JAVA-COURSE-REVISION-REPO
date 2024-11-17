package lecture55;

import java.lang.reflect.Method;

public class Demo03 {
    public static void main(String[] args) {
        class Student{
            int a;
            int b;
            static void m1(){}
            void m2(){}
            Student(){}
        }
        Student student = new Student();
        Class<? extends Student> ref = student.getClass();
        Method[] methods = ref.getMethods();
        for (Method method : methods){
            System.out.println(method.getName());
        }

//        PackageName-ClassName-@NumbersAddress(HashCOde)
        System.out.println(student);
        System.out.println(student.getClass());
        System.out.println(student.getClass().getName());
    }
}
