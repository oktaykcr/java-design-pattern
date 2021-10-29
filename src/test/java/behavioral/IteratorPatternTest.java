package behavioral;

import behavioral.iterator.Iterator;
import behavioral.iterator.IteratorImpl;
import org.junit.Test;
import structural.composite.*;

public class IteratorPatternTest {

    /**
     * Iterator pattern can be used with composite design pattern to get each item of composite class.
     * OUTPUT:
     * Component Name: Graphic Card, Price: 50.500000
     * Component Name: Monitor, Price: 200.000000
     * Component Name: Motherboard, Price: 100.000000
     * Computer total price: 350.500000
     */
    @Test
    public void IteratorPattern() {
        Computer computer = new Computer();
        computer.addComponent(new GraphicCard());
        computer.addComponent(new Monitor());
        computer.addComponent(new Motherboard());

        for(Iterator<Component> iterator = new IteratorImpl<>(computer.getComponentList()); iterator.hasNext();) {
            Component component = iterator.next();
            System.out.printf("Component Name: %s, Price: %f%n", component.getName(), component.calculatePrice());
        }

        System.out.printf("%s total price: %f%n",computer.getName(), computer.calculatePrice());
    }
}
