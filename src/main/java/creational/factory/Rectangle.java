package creational.factory;

public class Rectangle implements Shape {

    private float width;
    private float height;

    public Rectangle(float width, float height) {
        System.out.println("Creating Rectangle...");
        this.width = width;
        this.height = height;
    }

    public float getArea() {
        return width * height;
    }

    public float getPerimeter() {
        return 2 * (width + height);
    }
}
