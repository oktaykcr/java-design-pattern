package behavioral.strategy;

public class Subtraction implements Strategy{
    @Override
    public int calculate(int x, int y) {
        return x - y;
    }
}
