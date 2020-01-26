package structural;

import org.junit.Test;
import structural.decorator.*;

public class DecoratorPatternTest {

    /**
     * OUTPUT:
     * BASIC HOUSE:
     * The foundation of house is built. Kitchen is built.
     * FULL HOUSE:
     * The foundation of house is built. Kitchen is built. Bathroom is built. Bedroom is built.
     */
    @Test
    public void decoratorPattern() {
        System.out.println("BASIC HOUSE:");

        House basicHouse = new Kitchen(new BasicHouse());
        basicHouse.build();

        System.out.println("\nFULL HOUSE:");

        House fullRoomHouse = new Bedroom(new Bathroom(new Kitchen(new BasicHouse())));
        fullRoomHouse.build();
    }

}
