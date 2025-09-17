public class StackMain{
    public static void main(String[] args) throws StackException {
        Stack s = new DynamicStack(5);
        s.push(56);
        s.push(34);
        s.push(90);
        s.push(100);
        s.push(31);
        s.push(44);

        System.out.println((char) s.pop());
    }
}