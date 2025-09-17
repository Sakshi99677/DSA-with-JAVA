
public class Human {

    int age;
    String name;
    // int[]                                                                          

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        // this.arr = new int[5];

    }

    public Human(Human other) {
        this.age = other.age;

        this.name = other.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
