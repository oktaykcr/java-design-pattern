package structural.decorator;

public class HouseDecorator implements House{

    protected House house;

    public HouseDecorator(House house) {
        this.house = house;
    }

    public void build() {
        this.house.build();
    }
}
