
public class ObjectPrint {

    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(45);
        System.out.println(obj.num);
    }
}
