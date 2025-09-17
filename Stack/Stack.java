public class Stack{
    protected int[] data ;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1; //pointer to the top of the stack

    public Stack(){
        this(DEFAULT_SIZE); //calling another constructor...
    }

    public Stack(int size){
        this.data = new int[size];

    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty array");
            // return -1;
        }
        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
            // return -1;
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr==data.length-1;
    }

    public boolean isEmpty(){
        return ptr==-1;
    }
}