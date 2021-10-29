package behavioral.memento;

import java.util.Date;

public class EditorOriginator {
    private String title;
    private String text;
    private Date createdDate;

    public EditorOriginator(String title, String text, Date createdDate) {
        this.title = title;
        this.text = text;
        this.createdDate = createdDate;
    }

    public EditorMemento backup() {
        return new EditorMemento(title, text, createdDate);
    }

    public void restore(EditorMemento editorMemento) {
        this.title = editorMemento.getTitle();
        this.text = editorMemento.getText();
        this.createdDate = editorMemento.getCreatedDate();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
