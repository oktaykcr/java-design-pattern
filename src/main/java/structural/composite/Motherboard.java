package structural.composite;

public class Motherboard implements Component {

    @Override
    public String getName() {
        return "Motherboard";
    }

    public float calculatePrice() {
        return 100.0f;
    }
}
