
public class daughter extends Parent {

    public daughter(int age) {
        super(49);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Ironman");
    }
}
