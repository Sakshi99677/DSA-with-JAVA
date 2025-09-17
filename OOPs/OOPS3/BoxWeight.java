
public class BoxWeight extends Box {

    double weight;

    // @Override        //can't overrride the static method
    // static void greeting() {
    //     System.out.println("Hey i am in box greetings.");
    // }
    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);    //call the parent class constructor...
        // System.out.println(super.h);

        this.weight = weight;
    }

}
