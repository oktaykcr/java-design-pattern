package behavioral;

import behavioral.command.*;
import org.junit.Test;

public class CommandPatternTest {

    /**
     * The light turned on!
     * The light turned off!
     */
    @Test
    public void commandPattern() {
        Light light = new Light();

        Command lightOnCommand = new LightOn(light);
        Command lightOffCommand = new LightOff(light);


        RemoteController remoteController = new RemoteController(lightOnCommand);
        remoteController.execute();

        remoteController.setCommand(lightOffCommand);
        remoteController.execute();
    }
}
