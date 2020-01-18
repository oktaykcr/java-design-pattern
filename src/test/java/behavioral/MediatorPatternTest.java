package behavioral;

import behavioral.mediator.ChatMediator;
import behavioral.mediator.ChatMediatorImpl;
import behavioral.mediator.User;
import behavioral.mediator.UserImpl;
import org.junit.Test;

public class MediatorPatternTest {

    /**
     * OUTPUT:
     * user sending message: Hello World!
     * user2 : Received Message: Hello World!
     * user3 : Received Message: Hello World!
     */
    @Test
    public void mediatorPattern() {
        ChatMediator chatMediator = new ChatMediatorImpl();

        User user = new UserImpl(chatMediator, "user");
        User user2 = new UserImpl(chatMediator, "user2");
        User user3 = new UserImpl(chatMediator, "user3");

        chatMediator.addUser(user);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        user.send("Hello World!");
    }
}
