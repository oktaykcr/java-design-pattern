package behavioral.visitor;

public interface SoldierVisitor {

    void visit(PrivateSoldier privateSoldier);
    void visit(SergeantSoldier sergeantSoldier);
}
