package behavioral.visitor;

public class HealthVisitor implements SoldierVisitor{

    private int moreHealth;

    public HealthVisitor(int moreHealth) {
        this.moreHealth = moreHealth;
    }

    @Override
    public void visit(PrivateSoldier privateSoldier) {
        privateSoldier.setHealth(privateSoldier.getHealth() + moreHealth);
    }

    @Override
    public void visit(SergeantSoldier sergeantSoldier) {
        sergeantSoldier.setHealth(sergeantSoldier.getHealth() + moreHealth * 2);
    }
}
