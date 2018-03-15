package HanYo;

public class RockHauler extends InfantryUnit {


    public RockHauler( double range, double armor, double atd, double health, double ats ) {
        super(range, armor, atd, health, ats);
    }

    public RockHauler(){
        super(100, 100, 200, 50, 0.25);
        System.out.println("RockHauler Spawned");
    }
}
