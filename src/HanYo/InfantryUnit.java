package HanYo;

public abstract class InfantryUnit {
    int range = 0;
    int armor = 0;
    int hps = 0;
    int health = 0;
    int ats = 0;

    public InfantryUnit(int range, int armor, int hps, int health, int ats){
        this.range = range;
        this.armor = armor;
        this.hps = hps;
        this.health = health;
        this.ats = ats;

    }
    public void takeDamage(int hps){
        int damageReduction = (armor/100)*10;
        hps = hps - damageReduction;
    }

    public void attack(InfantryUnit unit){
        int attackDamage = ats*hps;
        unit.takeDamage(attackDamage);
    }
}
