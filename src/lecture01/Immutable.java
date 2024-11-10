package lecture01;

public final class Immutable {
    private final int age;
    private final String name;

    private Immutable(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }

}
