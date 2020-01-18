package behavioral.command;

public class LightOff implements Command {

    private Light light;

    public LightOff(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.off();
    }
}
