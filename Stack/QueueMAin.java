public class QueueMAin{
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(78);
        queue.insert(90);

        queue.display();
        
    }
}