package structural.decorator;

public class Bathroom extends HouseDecorator {


    public Bathroom(House house) {
        super(house);
    }

    @Override
    public void build() {
        super.build();
        System.out.print("Bathroom is built. ");
    }
}
