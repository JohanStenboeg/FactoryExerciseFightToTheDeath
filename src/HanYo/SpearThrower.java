package HanYo;

public class SpearThrower extends InfantryUnit {

    public SpearThrower( double range, double armor, double atd, double health, double ats ) {
        super(range, armor, atd, health, ats);
    }
    public SpearThrower(){
        super(75, 100, 250, 50, 1);
        System.out.println("SpearThrower Spawned");
    }
}
