package Programmieren3.FileUndExceptions;

import java.io.*;

public class ReadZeichenFromFileAufKonsoleCountZeichenWhitespaces { //uebung13

    //Schreiben Sie ein Programm, welches von
    //einer Datei alle Zeichen einliest und auf der
    //Konsole ausgibt.
    //Zählen Sie die Anzahl der eingelesenen
    //Zeichen und geben Sie die Gesamtanzahl am
    //Ende aus.
    //Solution: ue_13 or ue_13_buffered_reader
    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\s54821\\Hallo1\\text1.txt");
        FileInputStream fis = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(fis);

        int byteRead = 0;
        int i = 0;
        int nonWhitespaceBytes =0;

        while ((byteRead = bis.read()) != -1) {
            System.out.print(i + ": ");
            System.out.print(byteRead);
            System.out.println("\t'"+ (char)byteRead+"'");
            i++;
            if(Character.isWhitespace((char)byteRead)){
                nonWhitespaceBytes++;
            }

        }
        System.out.println(i+ "Zeichen wurden gelesen");
        System.out.println("davon "+nonWhitespaceBytes+" Whitespace");
        bis.close();
    }


}

//            char[] ch = Character.toChars(byteRead);
//            System.out.println(ch[0]);

//            if(i>=3){
//                break;
//            }