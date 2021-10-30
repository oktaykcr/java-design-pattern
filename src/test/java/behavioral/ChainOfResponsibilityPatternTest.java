package behavioral;

import behavioral.chainOfResponsibility.Server;
import org.junit.Test;

public class ChainOfResponsibilityPatternTest {

    /**
     * IF PASSWORD LENGTH LESS THEN MIN_LENGTH OUTPUT:
     * Checking Validation Handler...
     * Login failed!
     *
     * VALID USERNAME AND PASSWORD OUTPUT:
     * Checking Validation Handler...
     * Checking Authentication Handler...
     * Checking Authorization Handler...
     * User successfully logged in.
     *
     */
    @Test
    public void chainOfResponsibilityPattern() {
        Server server = new Server();
        boolean result = server.login("helloworld", "test123");

        if(result) System.out.println("User successfully logged in.");
        else System.out.println("Login failed!");
    }

}
