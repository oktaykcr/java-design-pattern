package behavioral.visitor;

public abstract class Soldier {

    private String name;
    private int health;
    private int damage;

    public Soldier(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }

    public abstract void accept(SoldierVisitor soldierVisitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
