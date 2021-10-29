package structural;

import org.junit.Test;
import structural.proxy.Internet;
import structural.proxy.ProxyInternet;

public class ProxyPatternTest {

    /**
     * OUTPUT:
     * Could not connect to helloworld.com
     * Connecting to valid.com
     */
    @Test
    public void ProxyPattern() {
        Internet internet = new ProxyInternet();
        internet.connectTo("helloworld.com");
        internet.connectTo("valid.com");
    }
}
