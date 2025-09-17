// import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(45);

        ll list = new ll();
        list.insertFirst(45);
        list.insertFirst(67);

        list.insertFirst(23);
        list.insertFirst(45);

        list.insertLast(99);
        list.insertLast(60);
        list.insert(70, 3);
        list.deleteFirst();
        list.deleteLast();
        list.delete(2);
        
        list.display();
        list.insertRec(34, 3);
        list.display();




        // Dll list = new Dll();
        // list.insertFirst(45);
        // list.insertFirst(67);
        // list.insertFirst(80);
        // list.insertFirst(23);
        // list.insertLast(90);
        // list.insert(67, 33);

        // list.display();



    //    Cll list = new Cll();
    //    list.insert(45); 
    //    list.insert(23);
    //    list.insert(11);
    //    list.insert(88);
    //    list.delete(11);
    //    list.display();

    }
}
