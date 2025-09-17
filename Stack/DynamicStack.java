public class DynamicStack extends Stack {
    public DynamicStack() {
        super(); // Calls the default constructor of Stack
    }
    public DynamicStack(int size) {
        super(size); // Calls the parameterized constructor of Stack
    }

    @Override
    public boolean push(int item){
        if(this.isFull()){
            int[] temp = new int[data.length*2];
            //copy all the previous elements
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }

        //insert item...
        return super.push(item);

    }
}