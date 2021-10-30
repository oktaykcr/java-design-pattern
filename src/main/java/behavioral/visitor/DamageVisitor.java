package behavioral.visitor;

public class DamageVisitor implements SoldierVisitor{

    private int moreDamage;

    public DamageVisitor(int moreDamage) {
        this.moreDamage = moreDamage;
    }

    @Override
    public void visit(PrivateSoldier privateSoldier) {
        privateSoldier.setDamage(privateSoldier.getDamage() + moreDamage);
    }

    @Override
    public void visit(SergeantSoldier sergeantSoldier) {
        sergeantSoldier.setDamage(sergeantSoldier.getDamage() + moreDamage * 2);
    }
}
