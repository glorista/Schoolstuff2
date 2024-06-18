package Programmieren3.FileUndExceptions.uebung14;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class binary_ouput_PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
//        File f = new File("");
        String data = "das ist ein Test";
        PrintStream output = new PrintStream("C:\\Users\\s54821\\Hallo1\\text1.txt");
        output.print(data);
        output.flush();
        output.close();

    }
}
