package Programmieren3.File.uebung14;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//was in ne file reinschreiben

public class binary_output_fileOutputStream {


    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\s54821\\Hallo1\\text5.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(f);

        String output="This is my File Output";
        for(char c : output.toCharArray()){
            fileOutputStream.write(c);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
