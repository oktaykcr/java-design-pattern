package behavioral.visitor;

public class SergeantSoldier extends Soldier{

    public SergeantSoldier(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void accept(SoldierVisitor soldierVisitor) {
        soldierVisitor.visit(this);
    }
}
