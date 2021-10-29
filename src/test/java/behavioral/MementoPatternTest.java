package behavioral;

import behavioral.memento.*;
import org.junit.Test;

import java.util.Date;

public class MementoPatternTest {

    /**
     * OUTPUT:
     * Editor{title='Hello World', text='My text', createdDate=Sat Oct 30 00:17:00 TRT 2021}
     * Editor{title='new title', text='new text', createdDate=Sat Oct 30 00:17:01 TRT 2021}
     * Editor{title='Hello World', text='My text', createdDate=Sat Oct 30 00:17:00 TRT 2021}
     */
    @Test
    public void mementoPattern() {
        EditorCaretaker editorCaretaker = new EditorCaretaker();

        EditorOriginator editorOriginator = new EditorOriginator("Hello World", "My text", new Date());

        System.out.println(editorOriginator.toString());

        EditorMemento editorMemento = editorOriginator.backup();
        editorCaretaker.setMemento(editorMemento);

        editorOriginator = new EditorOriginator("new title", "new text", new Date());

        System.out.println(editorOriginator.toString());

        editorOriginator.restore(editorMemento);
        System.out.println(editorOriginator.toString());
    }
}
