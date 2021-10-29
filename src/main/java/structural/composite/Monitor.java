package structural.composite;

public class Monitor implements Component {

    @Override
    public String getName() {
        return "Monitor";
    }

    public float calculatePrice() {
        return 200.0f;
    }
}
