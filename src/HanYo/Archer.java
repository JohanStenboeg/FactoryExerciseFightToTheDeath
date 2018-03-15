package HanYo;

public class Archer extends InfantryUnit {

    public Archer( double range, double armor, double atd, double health, double ats ) {
        super(range, armor, atd, health, ats);
    }
    public Archer() {
        super(250, 100, 150, 200, 1);
        System.out.println("Archer Spawned");
    }


    }
