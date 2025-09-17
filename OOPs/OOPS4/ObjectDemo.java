
public class ObjectDemo {

    int num;

    public ObjectDemo(int par) {
        par = num;
    }

    //used in hashmap...
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //already know
    @Override
    public String toString() {
        return super.toString();
    }

    // @Override
    // protected void finalize() throws Throwable {
    //     super.finalize();
    // }
    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        System.out.println(obj.hashCode());
    }
}
