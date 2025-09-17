
public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c = a / b;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
