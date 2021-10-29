package behavioral.template;

public class VideoGame extends Game{
    @Override
    protected void initialize() {
        System.out.println("Initializing video game...");
    }

    @Override
    protected void start() {
        System.out.println("Starting video game...");
    }

    @Override
    protected void end() {
        System.out.println("Ending video game...");
    }
}
