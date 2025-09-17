
public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    // abstract parent();  //abstract consuctor is not allowed.
    static void hello() {
        System.out.println("HEllo fro parent class.");
    }

    void normal() {
        System.out.println("Hey this is normal");
    }

    abstract void career();

    abstract void partner();
}
