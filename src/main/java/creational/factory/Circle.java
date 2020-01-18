package creational.factory;

public class Circle implements Shape {

    private float radius;

    public Circle(float radius) {
        System.out.println("Creating Circle...");
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    public float getPerimeter() {
        return (float) (2* Math.PI * radius);
    }
}
