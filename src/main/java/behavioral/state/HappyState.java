package behavioral.state;

public class HappyState implements EmotionalState {

    @Override
    public void sayHello(EmotionStateContext context) {
        System.out.println("Hello, beautiful.");
    }

    @Override
    public void sayGoodBye(EmotionStateContext context) {
        System.out.println("Be well, do good work, and keep in touch.");
        context.setCurrentState(new SadState());
    }
}
