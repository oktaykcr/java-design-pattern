package behavioral.command;

public class LightOn implements Command {

    private Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.on();
    }
}
