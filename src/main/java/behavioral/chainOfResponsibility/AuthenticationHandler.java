package behavioral.chainOfResponsibility;

public class AuthenticationHandler extends Handler{

    public AuthenticationHandler() {
        next = new AuthorizationHandler();
    }

    @Override
    public boolean check(String username, String password) {
        System.out.println("Checking Authentication Handler...");
        return checkUsernameAndPasswordFromServer(username, password);
    }

    private boolean checkUsernameAndPasswordFromServer(String username, String password) {
        return next.check(username, password);
    }

}
