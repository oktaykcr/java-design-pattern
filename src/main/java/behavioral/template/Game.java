package behavioral.template;

public abstract class Game {

    protected abstract void initialize();
    protected abstract void start();
    protected abstract void end();

    public void play() {
        initialize();
        start();
        end();
    }
}
