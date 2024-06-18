package Programmieren3.FileUndExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamRKonsoleBuffReaderStopp { //uebung8
    //Schreiben Sie ein Programm, das zeilenweise
    //Tastatureingaben auf die Konsole schreibt, bis
    //das Wort „STOP“ eingegeben wird.
    //Verwenden Sie dazu den InputStream System.in
    //Verwenden Sie weiters die Klassen:
    // InputStreamReader und BufferedReader

    // Java program to demonstrate BufferedReader
    //import java.io.BufferedReader;
    //import java.io.IOException;
    //import java.io.InputStreamReader;
    //        public class Test {
    //            public static void main(String[] args)
    //                    throws IOException
    //            {
    //                // Enter data using BufferReader
    //                BufferedReader reader = new BufferedReader(
    //                        new InputStreamReader(System.in));
    //
    //                // Reading data using readLine
    //                String name = reader.readLine();
    //
    //                // Printing the read line
    //                System.out.println(name);
    //            }
    //        }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String oneLine = " ";
        while(!oneLine.equalsIgnoreCase("Stop")){
            oneLine= reader.readLine();
            System.out.println(oneLine);
        }
        reader.close();

        //mach nächste mal do while
    }
}
//SEINE LÖSUNG
// public static void main(String[] args) throws IOException {
//        // Ready to receive user Input
//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//
//        // legt einen BufferedReader über den InputStreamReader.
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//        // Zeile für Zeile wird eingelesen.
//        String line;
//        while (!(line = bufferedReader.readLine()).equals("STOP")) {
//            System.out.println(line);
//        }
//
//        // BR wird wird geschlossen
//        bufferedReader.close();
//        // Information, dass das Programm vorbei ist.
//        System.out.println("Closed");
//
//    }
