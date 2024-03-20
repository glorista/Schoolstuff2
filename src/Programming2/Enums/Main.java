package Programming2.Enums;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        //kann auch eine extra Zeile mit OpeningHours openingHours = new OpeningHours
        Shop coffeShop = new Shop("Cafe", new OpeningHours("07:00","23:00",OpeningVariations.TUETOFRI));

        //option 1
        OpeningHours openingHours1 = coffeShop.getOpeningHours();
        String isOpen = openingHours1.getOpeningHoursToday(DayOfWeek.TUESDAY);
        System.out.println(coffeShop.getName() + isOpen);

        //option 2
        System.out.println(coffeShop.getName() + coffeShop.getOpeningHours().getOpeningHoursToday(DayOfWeek.MONDAY));

        Shop shop2 = new Shop("tribeka", new OpeningHours("12:00", "18:00",OpeningVariations.TUETOFRI));

        System.out.println(shop2.getName() + shop2.getOpeningHours().getOpeningHoursToday(DayOfWeek.FRIDAY));
    }
}
