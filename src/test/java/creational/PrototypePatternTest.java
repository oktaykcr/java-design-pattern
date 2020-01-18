package creational;

import org.junit.Test;
import creational.prototype.Gameobject;
import creational.prototype.Ground;
import creational.prototype.Wall;

public class PrototypePatternTest {

    /**
     * OUTPUT:
     * Ground is created at X: 5.000000 , Y: -5.000000
     * Wall is created at X: 20.000000 , Y: 20.000000
     * Ground2 is created at X: 10.000000 , Y: -5.000000
     * Ground3 is created at X: 5.000000 , Y: -10.000000
     * Wall2 is created at X: 30.000000 , Y: 20.000000
     * @throws CloneNotSupportedException
     */
    @Test
    public void prototypePattern() throws CloneNotSupportedException {
        Gameobject groundGo = new Ground();
        groundGo.setName("Ground");
        groundGo.setOpacity(1f);
        groundGo.setxPos(5f);
        groundGo.setyPos(-5f);
        groundGo.setxSize(10f);
        groundGo.setySize(10f);
        ((Ground)groundGo).setWalkable(true);
        groundGo.instantiate(groundGo.getxPos(), groundGo.getyPos());

        Gameobject wallGo = new Wall();
        wallGo.setName("Wall");
        wallGo.setOpacity(1f);
        wallGo.setxPos(20f);
        wallGo.setyPos(20f);
        wallGo.setxSize(10f);
        wallGo.setySize(10f);

        ((Wall)wallGo).setWalkable(false);
        wallGo.instantiate(wallGo.getxPos(), wallGo.getyPos());

        //Clone game objects
        Gameobject ground2Go = (Gameobject) groundGo.clone();
        ground2Go.setName("Ground2");
        ground2Go.setxPos(10f);
        ground2Go.instantiate(ground2Go.getxPos(), ground2Go.getyPos());

        Gameobject ground3Go = (Gameobject) groundGo.clone();
        ground3Go.setName("Ground3");
        ground3Go.setyPos(-10f);
        ground3Go.instantiate(ground3Go.getxPos(), ground3Go.getyPos());

        Gameobject wall2Go = (Gameobject) wallGo.clone();
        wall2Go.setName("Wall2");
        wall2Go.setxPos(30f);
        wall2Go.instantiate(wall2Go.getxPos(), wall2Go.getyPos());
    }
}
