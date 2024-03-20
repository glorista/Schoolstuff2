package Programming2.Enums;

import java.time.DayOfWeek;

public class OpeningHours {
    private final String openingTime;
    private final String closingTime;
    private final OpeningVariations openingVariations;

    public OpeningHours(String openingTime, String closingTime, OpeningVariations openingVariations) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.openingVariations = openingVariations;
    }

    public String getOpeningHoursToday(DayOfWeek dayOfWeek) { //DayOfWeek von Java ein enum  dayOfWeek von uns eine variable als parameter
        if (openingVariations.equals(OpeningVariations.MONTOFRI)) { //
            if (dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY)) {
                return " is closed today";
            } else {
                return " is open from" + openingTime + " to " + closingTime + " today.";
            }
        } else if (openingVariations.equals(OpeningVariations.TUETOFRI)) {
            if (dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY) || dayOfWeek.equals(DayOfWeek.MONDAY)) {
                return " is closed today";
            } else {
                return " is open from" + openingTime + " to " + closingTime + " today.";
            }
        } else {
            return "does not have available opening times.";
        }
    }
}

