package Programmieren3.UebungForUni.src;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BinaerFile {
    public static void main(String[] args) throws IOException {
        File f = new File("hall0.txt");

        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < 20; i++) {
            bw.write(43);
            bw.flush();
        }
        bw.close();



    }
}