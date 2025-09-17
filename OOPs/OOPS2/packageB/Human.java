
public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("Hello DEAR");
        // System.out.println(this.name);     you can't use non-static things...
        // static - vegetarian and non-static are non - vegetarian
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
        Human.message();
    }

}
