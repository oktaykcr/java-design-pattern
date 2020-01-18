package creational.builder;

import creational.factory.Shape;

public class Triangle implements Shape {

    private final float a;
    private final float b;
    private final float c;
    private final float angle;

    public Triangle(TriangleBuilder triangleBuilder) {
        this.a = triangleBuilder.a;
        this.b = triangleBuilder.b;
        this.c = triangleBuilder.c;
        this.angle = triangleBuilder.angle;
    }

    public float getArea() {
        float s = (a + b + c) / 2f;
        return (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public float getPerimeter() {
        return a + b + c;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public float getAngle() {
        return angle;
    }

    public static class TriangleBuilder {

        private float a;
        private float b;
        private float c;
        private float angle;

        public TriangleBuilder(float a, float b, float c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public TriangleBuilder a(float a) {
            this.a = a;
            return this;
        }

        public TriangleBuilder b(float b) {
            this.a = b;
            return this;
        }

        public TriangleBuilder c(float c) {
            this.a = c;
            return this;
        }

        public TriangleBuilder angle(float angle) {
            this.angle = angle;
            return this;
        }

        public Triangle build() {
            Triangle triangle = new Triangle(this);
            return triangle;
        }

    }
}
