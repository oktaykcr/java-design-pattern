package other.nullobject;

public class NullEmployee extends Employee{
    @Override
    public String getName() {
        return "Employee is not found!";
    }
}
