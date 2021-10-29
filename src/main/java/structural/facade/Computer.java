package structural.facade;

import java.util.ArrayList;
import java.util.List;

public class Computer implements Component{

    private List<Component> componentList;

    public Computer() {
        this.componentList = new ArrayList<>();
    }

    public void addComponent(Component component) {
        componentList.add(component);
    }

    @Override
    public void execute() {
        for (Component component : componentList) {
            component.execute();
        }
        System.out.println("Computer started!");
    }
}
