package creational.prototype;

public class Ground extends Gameobject {

    private boolean isWalkable;

    @Override
    public void instantiate(float x, float y) {
        System.out.println(String.format("%s is created at X: %f , Y: %f", getName(), x, y));
    }

    public boolean isWalkable() {
        return isWalkable;
    }

    public void setWalkable(boolean walkable) {
        isWalkable = walkable;
    }
}
