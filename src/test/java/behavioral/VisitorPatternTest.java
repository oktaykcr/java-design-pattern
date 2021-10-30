package behavioral;

import behavioral.visitor.*;
import org.junit.Test;

public class VisitorPatternTest {

    /**
     * OUTPUT:
     * Soldier{name='Ryan', health=100, damage=50}
     * Soldier{name='Horvath', health=200, damage=100}
     * Soldier{name='Ryan', health=110, damage=50}
     * Soldier{name='Horvath', health=200, damage=104}
     */
    @Test
    public void visitorPattern() {
        Soldier prv = new PrivateSoldier("Ryan", 100, 50);
        Soldier sergeant = new SergeantSoldier("Horvath", 200, 100);

        System.out.println(prv.toString());
        System.out.println(sergeant.toString());

        SoldierVisitor healthVisitor = new HealthVisitor(10);
        SoldierVisitor damageVisitor = new DamageVisitor(2);

        // Add more health to private ryan
        prv.accept(healthVisitor);
        System.out.println(prv.toString());

        // Add more damage to Sergeant Horvath
        sergeant.accept(damageVisitor);
        System.out.println(sergeant.toString());
    }
}
