package Programmieren3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uebung8 {
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
