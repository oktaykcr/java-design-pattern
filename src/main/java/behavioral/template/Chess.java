package behavioral.template;

public class Chess extends Game{
    @Override
    protected void initialize() {
        System.out.println("Initializing chess...");
    }

    @Override
    protected void start() {
        System.out.println("Starting chess...");
    }

    @Override
    protected void end() {
        System.out.println("Ending chess...");
    }
}
