
public class Sigalton {

    // private int num =0;
    private Singleton() {

    }

    private static Singleton instance;

    public Singleton getInstance() {
        //  chcek whwther one obj is created

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

    }
}
