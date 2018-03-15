package HanYo;

public class Main {
    public static void main( String[] args ) {
        SpearThrower ST1 = new SpearThrower();
        Archer A1 = new Archer();
        Musketeer M1 = new Musketeer();
        RockHauler R1 = new RockHauler();
        CrossBowMan CBM1 = new CrossBowMan();


        while (CBM1.health >= 0.0 && A1.health >= 0.0)
        if (CBM1.health >= 0.0 && A1.health >= 0.0) {
            A1.attack(CBM1);
        } else System.out.println("Good Fight!");
        if (A1.health >= 0.0 && CBM1.health >= 0.0) {
            CBM1.attack(A1);
        } else System.out.println("Good Fight!");
        System.out.println(A1.health);
        System.out.println(CBM1.health);



    }
}
