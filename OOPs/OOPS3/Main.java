
public class Main {

    public static void main(String[] args) {
        Box Box = new Box(56, 87, 43);
        // Box box1 = new Box(Box);
        // System.out.println(Box.l + " " + Box.w + " " + Box.h);
        // System.out.println(box1.l + " " + box1.w + " " + box1.h);

        // BoxWeight box3 = new BoxWeight();
        // BoxWeight box4 = new BoxWeight(2, 3, 4, 5);
        // System.out.println(box4.h + " " + box4.l + " " + box4.w + " " + box4.weight);
        // System.out.println(box3.weight);
        // Box box5 = new BoxWeight(2, 3, 4, 8);    //imp****************************** 
        // System.out.println(box5.weight);
        // multilevel inheritance....
        // BoxPrice box = new BoxPrice(45,32,677);
        Box.greeting();
    }
}
