package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Computer implements Component {

    private List<Component> componentList;

    public Computer() {
        this.componentList = new ArrayList<Component>();
    }

    public float calculatePrice() {
        float totalPrice = 0f;
        for (Component component : componentList) {
            totalPrice += component.calculatePrice();
        }

        return totalPrice;
    }

    public void addComponent(Component component) {
        this.componentList.add(component);
    }

    public void removeComponent(Component component) {
        if(component != null && componentList.contains(component)) {
            this.componentList.remove(component);
        } else {
            System.out.println("Could not find component");
        }
    }

}
