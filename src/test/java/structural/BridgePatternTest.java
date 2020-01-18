package structural;

import org.junit.Test;
import structural.bridge.BlueColor;
import structural.bridge.RedColor;
import structural.bridge.Shape;
import structural.bridge.Square;

public class BridgePatternTest {

    /**
     * OUTPUT:
     * Square Color :red
     * Square Color :blue
     */
    @Test
    public void bridgePattern() {
        Shape square = new Square(new RedColor());
        square.applyColor();

        Shape square2 = new Square(new BlueColor());
        square2.applyColor();
    }
}
