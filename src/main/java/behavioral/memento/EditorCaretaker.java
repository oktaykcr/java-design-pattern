package behavioral.memento;

public class EditorCaretaker {

    private EditorMemento Memento;

    public EditorMemento getMemento() {
        return Memento;
    }

    public void setMemento(EditorMemento memento) {
        Memento = memento;
    }
}
