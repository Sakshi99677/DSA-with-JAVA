
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human Sakshi = new Human(24, "Sakshi");
        // Human twin = new Human(Sakshi);
        Human twin = (Human) Sakshi.clone();
        System.out.println(twin.age);

    }
}
