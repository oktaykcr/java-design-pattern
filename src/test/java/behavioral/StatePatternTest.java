package behavioral;

import behavioral.state.EmotionStateContext;
import behavioral.state.HappyState;
import org.junit.Test;

public class StatePatternTest {

    /**
     * OUTPUT:
     * Hello, beautiful.
     * Be well, do good work, and keep in touch.
     * Hello!
     * I just want to say goodbye.
     */
    @Test
    public void statePattern() {
        HappyState happyState = new HappyState();

        EmotionStateContext context = new EmotionStateContext(happyState);
        context.sayHello();
        context.sayGoodBye();

        // State is changed by happyState after calling goodBye method.
        context.sayHello();
        context.sayGoodBye();
    }
}
