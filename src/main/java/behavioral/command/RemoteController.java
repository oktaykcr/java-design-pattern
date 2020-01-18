package behavioral.command;

public class RemoteController {

    private Command command;

    public RemoteController(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
