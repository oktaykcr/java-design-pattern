package behavioral;

import behavioral.template.Chess;
import behavioral.template.Game;
import behavioral.template.VideoGame;
import org.junit.Test;

public class TemplateDesignPattern {

    /**
     * OUTPUT:
     * Initializing chess...
     * Starting chess...
     * Ending chess...
     * Initializing video game...
     * Starting video game...
     * Ending video game...
     */
    @Test
    public void TemplatePattern() {
        Game chess = new Chess();
        chess.play();

        Game videoGame = new VideoGame();
        videoGame.play();
    }
}
