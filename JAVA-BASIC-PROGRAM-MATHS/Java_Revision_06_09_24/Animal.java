package Java_Revision_06_09_24;


class Animal1 {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal1 {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Dog object
        Animal1 animal = dog; // Upcasting: Dog to Animal
        animal.makeSound();  // Calls Dog's overridden method: "Dog barks"


    }
}
