package behavioral.strategy;

public class Addition implements Strategy{
    @Override
    public int calculate(int x, int y) {
        return x + y;
    }
}
