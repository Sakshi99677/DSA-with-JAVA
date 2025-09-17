
import java.util.ArrayDeque;
import java.util.Deque;

public class InBuilltExamples{
    public static void main(String[] args){
        // Queue<Integer> Q = new LinkedList<>();
        // Q.add(56);
        // Q.add(34);
        // Q.add(90);
         
        //  System.out.println(Q.peek());
        //  System.out.println(Q.remove());
        //  System.out.println(Q.peek());

        // Stack<Integer> stack = new Stack<>();
        // stack.push(34);
        // stack.push(46);
        // stack.push(90);
        // stack.push(23);
       
        // System.out.println(stack.pop());


        //can insert and remove from both ends
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(34);
        deque.add(56);
        deque.add(90);
        System.out.println(deque.peek());


    }
}