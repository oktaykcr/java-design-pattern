package structural.proxy;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String address) {
        System.out.printf("Connecting to %s", address);
    }
}
