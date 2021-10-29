package behavioral.strategy;

public class Multiplication implements Strategy{
    @Override
    public int calculate(int x, int y) {
        return x * y;
    }
}
