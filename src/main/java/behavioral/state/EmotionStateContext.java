package behavioral.state;

public class EmotionStateContext {

    private EmotionalState currentState;

    public EmotionStateContext(EmotionalState emotionalState) {
        this.currentState = emotionalState;
    }

    public void sayHello() {
        this.currentState.sayHello(this);
    }

    public void sayGoodBye() {
        this.currentState.sayGoodBye(this);
    }

    public EmotionalState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(EmotionalState currentState) {
        this.currentState = currentState;
    }
}
