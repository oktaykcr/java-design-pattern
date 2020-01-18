package behavioral.mediator;

public class UserImpl extends User {

    public UserImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    public void send(String msg) {
        System.out.println(this.name + " sending message: " + msg);
        chatMediator.sendMessage(msg, this);
    }

    public void receive(String msg) {
        System.out.println(this.name + " : Received Message: " + msg);
    }
}
