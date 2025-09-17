
public class Dll {

    private Node head;

    public void insertFirst(int val) {

        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {

            head.prev = node;
        }

        head = node;

    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
        }
        while (last.next != null) { //important... not last... use last.next
            last = last.next;
        }

        last.next = node;
        node.prev = last;

    }

    public Node find(int val) {
        Node node = head;

        while (node != null) {
            if (node.val == val) {
                return node;
            }
            node = node.next;
        }

        return null;
    }

    public void insert(int after, int val) {
        Node p = find(after);
        if (p == null) {
            System.out.println("node not found");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            p.next.prev = node;
        }

    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " <--> ");
            last = node;
            node = node.next;
        }

        System.out.print("null\n");
        System.out.println("Print in reverse.");

        while (last != null) {
            System.out.print(last.val + " <--> ");
            last = last.prev;

        }
        System.out.print("null");
    }

    private class Node {

        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;

        }

        // public Node(int val, Node next, Node prev) {
        //     this.val = val;
        //     this.next = next;
        //     this.prev = prev;
        // }
    }
}
