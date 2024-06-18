package Programmieren3.FileUndExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uebung8_withExeptions {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String oneLine = " ";
        try {
            while (!oneLine.equalsIgnoreCase("Stop")) {
                oneLine = reader.readLine();
                System.out.println(oneLine);
            }

        } catch (IOException e) {
            //catch block 1
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                System.out.println("Reader successfully closed");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
