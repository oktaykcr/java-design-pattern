package creational;

import creational.builder.Triangle;
import creational.factory.Shape;
import org.junit.Test;

public class BuilderPatternTest {

    /**
     * OUTPUT:
     * Triangle perimeter:12.0 area:6.0
     * Triangle angle:30.0
     */
    @Test
    public void builderPattern() {
        Shape triangle = new Triangle.TriangleBuilder(3, 4 , 5).angle(30).build();

        System.out.println(String.format("Triangle perimeter:" + triangle.getPerimeter() + " area:" + triangle.getArea()));
        System.out.println(String.format("Triangle angle:" + ((Triangle) triangle).getAngle()));
    }
}
