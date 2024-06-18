package Programmieren3.FileUndExceptions;

import java.io.*;

public class ByteReadVonDateiAusgabeConsole { //uebung12
    //Implementieren Sie ein Binary Input Beispiel von den Folien (nicht selbst erarbeitet).
    //Aufgabenstellung später, mit Exceptions:--------------
    //Aufgabe:
    //Schreiben Sie Übung 12 neu (mit Exceptions):
    //1) löschen Sie den "throws IOExeption" Text aus der Methodensignatur von Main
    //2) behandeln Sie die (möglicherweise) auftretenden Exceptions mit try/catch
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\s54821\\Hallo1\\text1.txt");
        FileInputStream fis = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(fis);

        int byteRead =0;
        int i = 0;

        while((byteRead = bis.read()) != -1){
            //char[] ch = Character.toChars(byteRead);
            //System.out.println(ch[0]);
            System.out.print(i + ": ");
            System.out.print(byteRead);
            System.out.println("\t'"+ (char)byteRead+"'");
            i++;
//            if(i>=3){
//                break;
//            }
        }
        bis.close();
    }
}

//SEINE LÖSUNG
//public class Ue12 {
//
//    public static void main(String[] args) throws IOException {
//        File file = new File("test.txt");
//        // FileInputStream stellt eine Verbindung zur Datei her. Datei wird geöffnet.
//        FileInputStream fileInputStream = new FileInputStream(file);
//        // Für Optimierung der Performance -> BufferedInputStream
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//        // read() liefert Byte for Byte aus der Datei. Wenn das Ende erreicht ist, dann liefert die Methode -1 als Ergebnis.
//        // While-Schleife liest somit Zeichen um Zeichen aus.
//        int byteRead;
//        int i=0;
//        while ((byteRead = bufferedInputStream.read()) != -1) {
//            // char[] ch = Character.toChars(byteRead);
//            // System.out.println(ch);
//            // Byte wird in char umgewandelt und ausgegeben.
//            //System.out.print("Zeichen " + i + ": ");
//            System.out.print((int) ((char) byteRead));
//            System.out.println("\t'" + (char) byteRead + "'");
//            i++;
//        }
//        // close() gibt die Datei wieder frei.
//        bufferedInputStream.close();
//    }
//
//}
