package Programmieren1.Probepruefung.cookathome;

public class CookSubscription {

    private int age;
    private boolean vegan;
    private boolean veggie;
    private int activePerWeek;

//    public CookSubscription(int age, boolean vegan, boolean veggie, int activePerWeek) {
//        this.age = age;
//        this.vegan = vegan;
//        this.veggie = veggie;
//        this.activePerWeek = activePerWeek;
//    }

    public String firstBox(int age, boolean vegan, boolean veggie, int activePerWeek){
        if(vegan == true){
            return "Vegan";
        } else if (veggie == true) {
            return "Veggie";
        }else if (activePerWeek>=4 && age<=60){
            return "Fish";
        }else if(age<=20 || age>60){
            return "Veggie";
        }else{
            return "Vegan";
        }
    }

    public double[] suggestPrice(String box, int age){
        double[] ergebnisse = new double[2];

        if(box.equalsIgnoreCase("Fish")){
            if(age<=25){
                ergebnisse[0]=39.90;
            }else{
                ergebnisse[0]=49.90;
            }
            ergebnisse[1]=80;
        }

        if(box.equalsIgnoreCase("Veggie")){
            if(age<=25 || age>=60){
                ergebnisse[0]=19.90;
            }else{
                ergebnisse[0]=29.90;
            }
            ergebnisse[1]=42;
        }

        if(box.equalsIgnoreCase("Vegan")){
            if (age<30){
                ergebnisse[1]=45;
            }else{
                ergebnisse[1]=49.90;
            }
            ergebnisse[0]=15;
        }

        return ergebnisse;
    }


}
