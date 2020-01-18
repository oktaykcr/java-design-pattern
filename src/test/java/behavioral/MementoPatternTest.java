package behavioral;

import behavioral.memento.TextEditor;
import behavioral.memento.TextState;
import org.junit.Test;

public class MementoPatternTest {

    /**
     * Title: Title State 1 Content: Hello World
     * Title: Title State 2 Content: Hello World second text
     * Title: Title State 1 Content: Hello World
     */
    @Test
    public void mementoPattern() {
        TextEditor textEditor = new TextEditor();

        textEditor.write("Hello World");
        textEditor.setTitle("Title State 1");
        TextState state = textEditor.save();
        textEditor.getCurrentContext();

        textEditor.write(" second text");
        textEditor.setTitle("Title State 2");
        TextState state2 = textEditor.save();
        textEditor.getCurrentContext();


        textEditor.undo(state);
        textEditor.getCurrentContext();
    }
}
