package HanYo;

public abstract class InfantryUnit {
    double range = 0;
    double armor = 0;
    double atd = 0;
    double health = 0;
    double ats = 0;

    public InfantryUnit( double range, double armor, double atd, double health, double ats){
        this.range = range;
        this.armor = armor;
        this.atd = atd;
        this.health = health;
        this.ats = ats;

    }
    public void takeDamage(double atd){
        double damageReduction = (armor/100)*10;
        atd = atd - damageReduction;
        health = health - atd;
        System.out.println(InfantryUnit.this + " took " + atd + " damage" );
        if(health >= 0.0){
            System.out.println(InfantryUnit.this + " Died");
        }
    }

    public void attack(InfantryUnit unit){
        double attackDamage = ats* atd;
        unit.takeDamage(attackDamage);
        System.out.println(InfantryUnit.this + " attacked for " + attackDamage);
    }

}
