package structural;

import org.junit.Test;
import structural.composite.*;

public class CompositePatternTest {

    /**
     * OUTPUT:
     * Motherboard Price : 100.0
     * Computer total price : 350.5
     */
    @Test
    public void compositePattern() {
        Computer computer = new Computer();

        computer.addComponent(new Monitor());
        computer.addComponent(new GraphicCard());

        Component motherboard = new Motherboard();
        System.out.println(motherboard.getName() +" Price : " + motherboard.calculatePrice());
        computer.addComponent(motherboard);


        System.out.println(computer.getName() + " total price : " + computer.calculatePrice());
    }
}
