package Programmieren2.uebung2003;

public class WeatherForecast {

    //diesen Satz makieren und mit refactor und dann introduce constants eine erstellen und change all
    public static final String WILL_BE_CLOUDY = "Weather tomorrow will be cloudy";
    public static final String WILL_BE_RAINY = "Weather tomorrow will be rainy";
    public static final String WILL_BE_SUNNY = "Weather tomorrow will be sunny";

    private Himmelsrichtungen hr; //das enum dem wir den namen hr geben hier
    private double temperature;
    private double humidity;
    private boolean isCloudy;

    public String forecast(double temperature, double humidity, boolean isCloudy, Himmelsrichtungen hr) {
        if (hr.equals(Himmelsrichtungen.EAST)) { //wenn die himmelsrichtung east ist dann eine abfrage vom boolean
            if (isCloudy) { //ist true so wie ==true
                //dann scenarios erstellen indem man die konstanten einbauen kann
                if (temperature > 25.3 && humidity > 74.6) {
                    return WILL_BE_RAINY;
                } else if (temperature > 25 && humidity < 74) {
                    return WILL_BE_CLOUDY;
                } else {
                    return WILL_BE_SUNNY;
                }
            } else {
                if (temperature < 10 && humidity > 12) {
                    return WILL_BE_SUNNY;
                } else if (temperature > 25 && humidity > 80) {
                    return WILL_BE_RAINY;
                } else {
                    return WILL_BE_CLOUDY;
                }
            }
        } else if (hr.equals(Himmelsrichtungen.WEST)) { //das gleiche für alle anderen Himmelsrichtungen
            if (isCloudy) { //ist true so wie ==true
                if (temperature > 25.3 && humidity > 74.6) {
                    return WILL_BE_RAINY;
                } else if (temperature > 25 && humidity < 74) {
                    return WILL_BE_CLOUDY;
                } else {
                    return WILL_BE_SUNNY;
                }
            } else {
                if (temperature < 10 && humidity > 12) {
                    return WILL_BE_SUNNY;
                } else if (temperature > 25 && humidity > 80) {
                    return WILL_BE_RAINY;
                } else {
                    return WILL_BE_CLOUDY;
                }
            }
        } else { //hier würden die anderen zwei himmelsrichtungen stehen aber wir sind faul deswegen alles andere cloudy
            return WILL_BE_CLOUDY;
        }

    }
}
