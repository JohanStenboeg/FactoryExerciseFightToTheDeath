package HanYo;

public class CrossBowMan extends InfantryUnit {

    public CrossBowMan( double range, double armor, double atd, double health, double ats ) {
        super(range, armor, atd, health, ats);
    }

    public CrossBowMan(){
        super(200, 150, 175, 75, 0.5);
        System.out.println("CrossBowMan Spawned");
    }
}
