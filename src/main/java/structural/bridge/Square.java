package structural.bridge;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    public void applyColor() {
        System.out.print("Square Color :");
        color.applyColor();
    }
}
