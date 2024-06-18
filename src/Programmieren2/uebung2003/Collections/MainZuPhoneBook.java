package Programmieren2.uebung2003.Collections;

import java.util.HashMap;

public class MainZuPhoneBook {
    public static void main(String[] args) {
        PhoneBookService phoneBookService = new PhoneBookService(new HashMap<>());

        phoneBookService.addEntryToPhoneBook("Gloria","01234");
        phoneBookService.addEntryToPhoneBook("Horst","17895");
        phoneBookService.addEntryToPhoneBook("Peter","36954");
        phoneBookService.addEntryToPhoneBook("Uwe","07645");
        phoneBookService.addEntryToPhoneBook("Barbara","03658");

        phoneBookService.printPhoneBook();
        System.out.println(phoneBookService.isNumberInPhoneBook("25974"));
        System.out.println(phoneBookService.findPhoneNumberForName("Uwe"));
        phoneBookService.deleteEntryFromPhoneBook("Uwe");
        phoneBookService.printPhoneBook();

    }
}
