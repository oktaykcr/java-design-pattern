package behavioral.chainOfResponsibility;

public abstract class Handler {
    protected Handler next;

    public abstract boolean check(String username, String password);
}
