package creational.prototype;

public abstract class Gameobject implements Cloneable{

    private String name;
    private float xPos;
    private float yPos;
    private float xSize;
    private float ySize;
    private float opacity;

    public abstract void instantiate(float x, float y);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getxPos() {
        return xPos;
    }

    public void setxPos(float xPos) {
        this.xPos = xPos;
    }

    public float getyPos() {
        return yPos;
    }

    public void setyPos(float yPos) {
        this.yPos = yPos;
    }

    public float getxSize() {
        return xSize;
    }

    public void setxSize(float xSize) {
        this.xSize = xSize;
    }

    public float getySize() {
        return ySize;
    }

    public void setySize(float ySize) {
        this.ySize = ySize;
    }

    public float getOpacity() {
        return opacity;
    }

    public void setOpacity(float opacity) {
        this.opacity = opacity;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
