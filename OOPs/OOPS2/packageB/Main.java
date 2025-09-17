
public class Main {

    public static void main(String[] args) {
        Human A = new Human(23, "fdsf", 24999, false);
        System.out.println(Human.population);

        Human B = new Human(56, "ghghjg", 67577, true);
        System.out.println(Human.population);

        Main fun = new Main();
        fun.fun2();

    }

    void fun2() {
        greetings();
    }

    static void fun() {
        // you can't access non static stuff without referencing it
        Main obj = new Main();
        obj.greetings();
    }

    void greetings() {
        fun();
        System.out.println("Hello world");
    }

}
