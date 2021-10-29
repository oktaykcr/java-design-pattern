package structural.composite;

public class GraphicCard implements Component {

    @Override
    public String getName() {
        return "Graphic Card";
    }

    public float calculatePrice() {
        return 50.5f;
    }

}
