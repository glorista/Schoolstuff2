package Programmieren3;

import java.io.*;
import java.util.Arrays;

//wie man ein Object speichern in einer Datei und lesen
public class uebung16_withObject {
    public static class myClass implements Serializable {
        int a = 5;
        public String b = "Hallo ich bin String in der Klasse";

        byte[] c = {'e','x','a','m','p','l','e'};

        double d =7.22;

        @Override
        public String toString() {
            return "myClass{" +
                    "a=" + a +
                    ", b='" + b + '\'' +
                    ", c=" + Arrays.toString(c) +
                    ", d=" + d +
                    '}';
        }
    }

    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        ObjectOutputStream oos= null;
        ObjectInputStream ois = null;
        String obj = "Hallo Welt";
        myClass meinObject = new myClass();

        try{
            fos = new FileOutputStream("C:\\Users\\s54821\\Hallo1\\object.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(meinObject);
            oos.flush();
            System.out.println("File erfolgreich geschrieben");
            fis = new FileInputStream("C:\\Users\\s54821\\Hallo1\\object.dat");
            ois = new ObjectInputStream(fis);
            myClass eingeleseneKlasse = (myClass) ois.readObject();
            System.out.println("Habe erfolgreich "+ eingeleseneKlasse+ " gelesen");

        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            System.out.println("Fehler beim Einlesen: Class not found");
            e.printStackTrace();
        }finally {
            try{
                oos.close();
                ois.close();
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }
}
