package HAufgaben2;

public class TestGrund {
    public static void main(String[] args) {
        Grundsteuer g1 = new Grundsteuer();

        int[][] grundstuecke={
                {1,30,40},
                {2,20,50},
                {3,10,30}
        };


        System.out.println("Summe: "+g1.grundsteuerBerechnen(grundstuecke));

    }
}
