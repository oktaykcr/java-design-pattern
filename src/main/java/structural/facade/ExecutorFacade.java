package structural.facade;

/*
    Facace class can be singleton
*/
public class ExecutorFacade {

    private static ExecutorFacade instance;

    private ExecutorFacade() {}

    public static ExecutorFacade getInstance() {
        if(instance == null) {
            instance = new ExecutorFacade();
        }
        return instance;
    }

    public void startComputer() {
        Computer computer = new Computer();
        computer.addComponent(new Hd());
        computer.addComponent(new CPU());
        computer.addComponent(new Ram());
        computer.execute();
    }
}
