package behavioral.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void calculateStrategy(int x, int y) {
        System.out.printf("Result : %d%n", strategy.calculate(x, y));
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
