package behavioral.mediator;

import java.util.ArrayList;

public class ChatMediatorImpl implements ChatMediator {

    private ArrayList<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<User>();
    }

    public void sendMessage(String msg, User user) {
        for(User u : this.users) {
            if(u != user) {
                u.receive(msg);
            }
        }
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}
