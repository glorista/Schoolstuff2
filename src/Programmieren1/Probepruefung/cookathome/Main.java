package Programmieren1.Probepruefung.cookathome;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CookSubscription c1 = new CookSubscription();
        c1.firstBox(25,false,false,6);
        System.out.println(c1.firstBox(26,false,false,2));
        System.out.println(Arrays.toString(c1.suggestPrice("veggie",32)));
    }
}
