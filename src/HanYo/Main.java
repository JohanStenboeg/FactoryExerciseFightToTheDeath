package HanYo;

public class Main {
    public static void main( String[] args ) {
        SpearThrower ST1 = new SpearThrower();
        Archer A1 = new Archer();
        Musketeer M1 = new Musketeer();
        RockHauler R1 = new RockHauler();
        CrossBowMan CBM1 = new CrossBowMan();

        while(CBM1.health >= 0.0){
            A1.attack(CBM1);
            CBM1.takeDamage(A1.atd);
            CBM1.attack(A1);
            A1.takeDamage(CBM1.atd);
        }



    }
}
