package behavioral.memento;

public class TextEditor {

    private StringBuilder content = new StringBuilder();
    private String title;

    public void write(String text) {
        this.content.append(text);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TextState save() {
        return new TextState(this.content, this.title);
    }

    public void undo(TextState textState) {
        if(textState != null) {
            this.content = textState.getContent();
            this.title = textState.getTitle();
        }
    }

    public void getCurrentContext() {
        System.out.println(String.format("Title: %s Content: %s", title, content.toString()));
    }
}
