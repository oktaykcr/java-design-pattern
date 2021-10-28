package structural.flyweight;

public class Circle implements Shape {

    private final float radius = 5f; //intrinsic, immutable, can be shared
    private String color; //extrinsic, mutable by client, can not be shared

    public Circle(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println(String.format("Drawn %s circle with radius %f", color, radius));
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
