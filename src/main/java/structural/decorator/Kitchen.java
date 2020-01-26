package structural.decorator;

public class Kitchen extends HouseDecorator {

    public Kitchen(House house) {
        super(house);
    }

    @Override
    public void build() {
        super.build();
        System.out.print("Kitchen is built. ");
    }
}
