package behavioral;

import behavioral.observer.MyTopic;
import behavioral.observer.Observer;
import behavioral.observer.Subscriber;
import org.junit.Test;

public class ObserverPatternTest {

    /**
     * OUTPUT:
     * obs no new message
     * Message Posted to Topic:Hello World
     * obs consuming message: Hello World
     * obs2 consuming message: Hello World
     * obs3 consuming message: Hello World
     */
    @Test
    public void observerPattern() {
        MyTopic myTopic = new MyTopic();

        Observer observer = new Subscriber("obs");
        Observer observer2 = new Subscriber("obs2");
        Observer observer3 = new Subscriber("obs3");

        myTopic.register(observer);
        myTopic.register(observer2);
        myTopic.register(observer3);

        observer.setTopic(myTopic);
        observer2.setTopic(myTopic);
        observer3.setTopic(myTopic);

        observer.update();

        myTopic.postMessage("Hello World");

    }
}
