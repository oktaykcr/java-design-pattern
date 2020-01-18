package creational;

import creational.factory.Shape;
import creational.factory.ShapeFactory;
import creational.factory.Type;
import org.junit.Test;

public class FactoryPatternTest {

    /**
     * OUTPUT:
     * Creating Square...
     * Creating Rectangle...
     * Creating Circle...
     * Square perimeter:0.46519446 area:0.013525368
     * Rectangle perimeter:0.94340265 area:0.04205858
     * Circle perimeter:2.7576125 area:0.60514104
     */
    @Test
    public void factoryPattern() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = shapeFactory.createShape(Type.SQUARE);
        Shape rectangle = shapeFactory.createShape(Type.RECTANGLE);
        Shape circle = shapeFactory.createShape(Type.CIRCLE);

        System.out.println(String.format("Square perimeter:" + square.getPerimeter() + " area:" + square.getArea()));
        System.out.println(String.format("Rectangle perimeter:" + rectangle.getPerimeter() + " area:" + rectangle.getArea()));
        System.out.println(String.format("Circle perimeter:" + circle.getPerimeter() + " area:" + circle.getArea()));
    }
}
