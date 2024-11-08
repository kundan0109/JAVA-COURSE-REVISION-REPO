package lecture39.singleton.encapsulation;

// WHY IS NOT STORING THE PREVIOUS VALUE STORING WHILE OBJECT CREATION
public class PersonTest {
    public static void main(String[] args) {

//        Person person = new Person(44, "Kundan");
//        System.out.println(person.age);

        Person person = new Person(11, "Depaaak");

        person.setAge(-99);
        System.out.println(person.getAge());
//        person.setName("Deepak");
        System.out.println(person.getName());



    }
}
