package behavioral.chainOfResponsibility;

public class AuthorizationHandler extends Handler{

    public AuthorizationHandler() {
        next = null;
    }

    @Override
    public boolean check(String username, String password) {
        System.out.println("Checking Authorization Handler...");
        return checkRoleFromServerAccordingToUsername(username);
    }

    private boolean checkRoleFromServerAccordingToUsername(String username) {
        return true;
    }
}
