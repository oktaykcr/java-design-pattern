package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static Map<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Circle getCircleByColorName(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
        }

        return circle;
    }
}
