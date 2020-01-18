package creational.factory;

import java.util.Random;

public class ShapeFactory {

    private Random random = new Random();

    public Shape createShape(Type type) {
        Shape shape = null;
        switch (type) {
            case CIRCLE:
                shape = new Circle(random.nextFloat());
                break;
            case SQUARE:
                shape = new Square(random.nextFloat());
                break;
            case RECTANGLE:
                shape = new Rectangle(random.nextFloat(), random.nextFloat());
                break;
        }
        return shape;
    }

}
