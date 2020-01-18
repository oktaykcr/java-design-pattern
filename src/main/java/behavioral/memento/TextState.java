package behavioral.memento;

public class TextState {

    private StringBuilder content;
    private String title;

    public TextState(StringBuilder content, String title) {
        this.content = new StringBuilder(content.toString());
        this.title = title;
    }

    public StringBuilder getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

}
