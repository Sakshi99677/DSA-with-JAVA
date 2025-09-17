
public class Main {

    public static void main(String[] args) {
        son son = new son(30);
        son.career();

        daughter daughter = new daughter(20);
        daughter.career();

        // Parent p = new Parent();    can't instatiate a abstract class
        Parent.hello();

        son.normal();
    }
}
