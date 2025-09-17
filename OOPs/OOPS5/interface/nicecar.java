
public class nicecar {

    private Engine engine;
    private Media player = new CDplayer();

    public nicecar() {
        engine = new PowerEngine();
    }

    public nicecar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

}
