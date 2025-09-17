
public class InnerCLass {

    //  only inner classes will be static
    static class Test {

        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Sakshi");
        Test b = new Test("Shinchan");

        System.out.println(a.name + "   " + b.name);
    }
}
