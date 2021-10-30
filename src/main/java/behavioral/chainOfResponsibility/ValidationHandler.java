package behavioral.chainOfResponsibility;

public class ValidationHandler extends Handler {

    private final int MIN_LENGTH = 6;

    public ValidationHandler() {
        next = new AuthenticationHandler();
    }

    @Override
    public boolean check(String username, String password) {
        System.out.println("Checking Validation Handler...");
        if(username.length() >= MIN_LENGTH && password.length() >= MIN_LENGTH) {
            return next.check(username, password);
        }
        return false;
    }
}
