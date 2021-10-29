package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private static List<String> bannedAddresses = new ArrayList(){
        {
            add("helloworld.com");
            add("abc.net");
            add("world.io");
            add("hello.world");
        }
    };

    private Internet realInternet;

    @Override
    public void connectTo(String address) {
        if(bannedAddresses.contains(address)) {
            System.out.printf("Could not connect to %s%n", address);
            return;
        }

        if(realInternet == null) {
            realInternet = new RealInternet();
        }
        realInternet.connectTo(address);
    }
}
