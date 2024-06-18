package Programmieren3.ReadAndWriteConsole;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class ConsoleWriterNurAusgabe {
    public static void main(String[] args) {
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        try {
            writer.write("Enter your name: ");
            writer.flush(); // Ensure the text is written to the console
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
