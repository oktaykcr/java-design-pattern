package structural;

import org.junit.Test;
import structural.facade.ExecutorFacade;

public class FacadePatternTest {

    /**
     * OUTPUT:
     * Executing hd...
     * Executing CPU...
     * Executing ram...
     * Computer started!
     */
    @Test
    public void FacadePattern() {
        ExecutorFacade.getInstance().startComputer();
    }
}
