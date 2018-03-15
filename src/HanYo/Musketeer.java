package HanYo;

public class Musketeer extends InfantryUnit {

    public Musketeer( double range, double armor, double atd, double health, double ats ) {
        super(range, armor, atd, health, ats);
    }
    public Musketeer(){
        super(300, 50, 200, 50, 0.5);
        System.out.println("Musketeer Spawned");
    }
}
