package structural.facade;

public class CPU implements Component{
    @Override
    public void execute() {
        System.out.println("Executing CPU...");
    }
}
