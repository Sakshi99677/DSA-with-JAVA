
public class Car implements Engine, Break, Media {

    @Override
    public void start() {
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I acc like a normal car");
    }

    @Override
    public void brake() {
        System.out.println("I break like a normal car");
    }

}
