package other.nullobject;

public class Manager extends Employee {

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
