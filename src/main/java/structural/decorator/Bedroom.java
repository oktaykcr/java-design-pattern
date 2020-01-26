package structural.decorator;

public class Bedroom extends HouseDecorator {


    public Bedroom(House house) {
        super(house);
    }

    @Override
    public void build() {
        super.build();
        System.out.print("Bedroom is built. ");
    }
}
