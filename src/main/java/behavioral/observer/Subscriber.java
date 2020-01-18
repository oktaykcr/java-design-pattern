package behavioral.observer;

public class Subscriber implements Observer {

    private String name;
    private Topic topic;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        String message = (String) this.topic.getUpdate(this);
        if(message == null) System.out.println(name + " no new message");
        else System.out.println(name + " consuming message: " + message);
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
