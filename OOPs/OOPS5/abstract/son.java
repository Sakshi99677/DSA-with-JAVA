
public class son extends Parent {

    public son(int age) {
        super(49);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Pepper pot");
    }

}
