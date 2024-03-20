package Programming2.uebung2003;

public class MainzuWeather {
    public static void main(String[] args) {
        WeatherForecast tomorrow = new WeatherForecast(); //AllesMoegliche.objekt erstellen weil die methode nicht static ist

        //Himmelsrichtungen(ist das wo wir es herholen).NORTH(des was wir raus holen aus dem enum
        System.out.println(tomorrow.forecast(25,74,true,Himmelsrichtungen.NORTH));
        System.out.println(tomorrow.forecast(9,88,false,Himmelsrichtungen.EAST));
    }
}
