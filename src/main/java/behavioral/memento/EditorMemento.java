package behavioral.memento;

import java.util.Date;

public class EditorMemento {
    private String title;
    private String text;
    private Date createdDate;

    public EditorMemento(String title, String text, Date createdDate) {
        this.title = title;
        this.text = text;
        this.createdDate = createdDate;
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
}
