package Programmieren3.File;

import java.io.*;

public class uebung9 {
    //Schreiben Sie ein Programm, welches eine Textdatei mittels Filewriter und Printwriter erstellt.

    public static void main(String[] args) throws IOException {
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
