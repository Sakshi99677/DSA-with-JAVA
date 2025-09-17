public class Wrapper{
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a,b);
        // System.out.println(a +" "+b);

        // final int c = 3;
        // c = 6;

        final A Sakshi = new A("Sakshi");       
        Sakshi.name = "bbbbb";
        // Sakshi = new A();    you can't reassign a final thing

        A obj = new A("hhjkhjk");
        System.out.println(obj);

    }
    static void swap(Integer a, Integer b){
        int temp = a;
        a =b;
        b=temp;
    }
}

class A{
    final int a=7;
    String name;
    public A(String name){
        this.name=name;
    }

    // @Override
    // protected void finalize() throws Throwable {
    //     System.out.println("Object is destroyed");
    // }
    
    

}