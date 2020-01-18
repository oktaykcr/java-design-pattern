package creational.factory;

public class Square implements Shape {

    private float edge;

    public Square(float edge) {
        System.out.println("Creating Square...");
        this.edge = edge;
    }

    public float getArea() {
        return edge * edge;
    }

    public float getPerimeter() {
        return 4 * edge;
    }
}
