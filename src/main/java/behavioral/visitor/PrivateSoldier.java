package behavioral.visitor;

public class PrivateSoldier extends Soldier{

    public PrivateSoldier(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void accept(SoldierVisitor soldierVisitor) {
        soldierVisitor.visit(this);
    }
}
