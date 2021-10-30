package behavioral.chainOfResponsibility;

public class Server {
    private final Handler startHandler;

    public Server() {
        this.startHandler = new ValidationHandler();
    }

    public boolean login(String username, String password) {
        return startHandler.check(username, password);
    }
}
