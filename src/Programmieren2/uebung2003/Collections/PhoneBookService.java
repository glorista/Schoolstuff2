package Programmieren2.uebung2003.Collections;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookService {
    private Map<String, String> phoneBook = new HashMap<>();

    public PhoneBookService(Map<String, String> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void addEntryToPhoneBook(String name, String nummer){
        phoneBook.put(name,nummer);
    }

    public void deleteEntryFromPhoneBook(String name){
        phoneBook.remove(name);
    }

    public String findPhoneNumberForName(String name){
        String phoneNumber= null;
        for (String key: phoneBook.keySet()){
            if (key.equals(name)){
                phoneNumber=phoneBook.get(key);
            }
        }
        return phoneNumber;
    }

    public boolean isNumberInPhoneBook(String nummer){
        boolean isContained = false;
        for(String value : phoneBook.values()) {
            if(nummer.equals(value)){
                isContained= true;
                break;
            }
        }
        return isContained;
    }

    public void printPhoneBook(){
        for (String s : phoneBook.keySet()){
            System.out.println("Name: "+s+", Nummer: "+phoneBook.get(s));
        }

    }
}
