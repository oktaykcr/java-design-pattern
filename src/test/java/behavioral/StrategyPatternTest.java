package behavioral;

import behavioral.strategy.Addition;
import behavioral.strategy.Context;
import behavioral.strategy.Multiplication;
import behavioral.strategy.Subtraction;
import org.junit.Test;

public class StrategyPatternTest {

    /**
     * OUTPUT:
     * Result : 15
     * Result : 50
     * Result : -5
     */
    @Test
    public void StrategyPattern() {
        Context context = new Context(new Addition());
        context.calculateStrategy(5, 10);

        context.setStrategy(new Multiplication());
        context.calculateStrategy(5, 10);

        context.setStrategy(new Subtraction());
        context.calculateStrategy(5, 10);
    }
}
