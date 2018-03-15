package HanYo;

public class Archer extends InfantryUnit {

    public Archer( double range, double armor, double atd, double health, double ats ) {
        super(range, armor, atd, health, ats);
    }
    public Archer() {
        super(250, 150, 150, 50, 1);
        System.out.println("Archer Spawned");
    }


    }
