package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Topic {

    private List<Observer> observers;
    private String message;
    private final Object MUTEX = new Object();
    private boolean changed;

    public MyTopic() {
        observers = new ArrayList<Observer>();
    }

    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if(!observers.contains(observer)) observers.add(observer);
        }
    }

    public void unregister(Observer observer) {
        synchronized (MUTEX) {
            observers.remove(observer);
        }
    }

    public void notifyObservers() {
        List<Observer> currentObservers = null;
        synchronized (MUTEX) {
            if(!changed) return;
            this.changed = false;
            currentObservers = new ArrayList<Observer>(observers);
        }
        for(Observer observer : currentObservers) {
            observer.update();
        }
    }

    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message Posted to Topic:" + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
