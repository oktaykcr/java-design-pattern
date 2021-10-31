package behavioral.state;

public class SadState implements EmotionalState {

    @Override
    public void sayHello(EmotionStateContext context) {
        System.out.println("Hello!");
    }

    @Override
    public void sayGoodBye(EmotionStateContext context) {
        System.out.println("I just want to say goodbye.");
    }
}
