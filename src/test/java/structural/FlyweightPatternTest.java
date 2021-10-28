package structural;

import org.junit.Test;
import structural.flyweight.Circle;
import structural.flyweight.ShapeFactory;

public class FlyweightPatternTest {

    /**
     * OUTPUT:
     * Drawn red circle with radius 5.000000
     * 213193302
     * Drawn blue circle with radius 5.000000
     * 1502635287
     * Drawn red circle with radius 5.000000
     * 213193302
     */
    @Test
    public void flyweightPattern() {
        Circle circle = ShapeFactory.getCircleByColorName("red");
        circle.draw();
        System.out.println(circle.hashCode());

        Circle circle2 = ShapeFactory.getCircleByColorName("blue");
        circle2.draw();
        System.out.println(circle2.hashCode());

        Circle circle3 = ShapeFactory.getCircleByColorName("red");
        circle3.draw();
        System.out.println(circle3.hashCode());
    }
}
