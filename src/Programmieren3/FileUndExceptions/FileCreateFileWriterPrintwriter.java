package Programmieren3.FileUndExceptions;

import java.io.*;

public class FileCreateFileWriterPrintwriter {
    //Schreiben Sie ein Programm, welches eine Textdatei mittels Filewriter und Printwriter erstellt.

    public static void main(String[] args) throws IOException { //uebung9
        File f = new File("C:\\Users\\s54821\\Hallo1\\text.txt");

        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);

        String zeile1 ="Das ist die Zeile 1";
        String zeile2 ="Das ist die Zeile 2";

        pw.println(zeile1);
        pw.println(zeile2);

        pw.flush(); //schreibt alles, was wir angegeben haben, falls was vergessen wurde (zb bei Störungen)
        pw.close(); //braucht nur den äußersten schließen also kein fw.close();

//        fw.write("Hallo");
//        fw.write("\n zeile2\n");
//        fw.write("Hola\n");
//
//        pw.println("-------");
//        pw.println("Ich bin ein PrintWriter");
//        fw.close();
//        pw.close();


//        FileReader fileReader = new FileReader(f);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }
//        bufferedReader.close();
//    }
    }
}
//FileWriter myWriter = new FileWriter("filename.txt");
//      myWriter.write("Files in Java might be tricky, but it is fun enough!");
//      myWriter.close();


//SEINE LÖSUNG
//public class ue_9_BufferedWriter_example {
//    /*
//    Methods of BufferedWriter
//        The BufferedWriter class provides implementations for different methods present in Writer.
//    write() Method
//    write() - writes a single character to the internal buffer of the writer
//    write(char[] array) - writes the characters from the specified array to the writer
//    write(String data) - writes the specified string to the writer
//     */
//
//    public static void main(String args[]) throws IOException {
//        FileWriter fileWriter = new FileWriter("neue_datei_18mai.txt");
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        // BufferedWriter bufferedReader = new BufferedWriter(new FileWriter("neue_datei_18mai.txt"));
//
//        String data = "Das ist ein test";
//        bufferedWriter.write(data);
//        bufferedWriter.write(data);
//        bufferedWriter.newLine();
//        bufferedWriter.write(data);
//        bufferedWriter.flush();
//        bufferedWriter.close();
//        System.out.println("Fertig");
//
//    }
//}
