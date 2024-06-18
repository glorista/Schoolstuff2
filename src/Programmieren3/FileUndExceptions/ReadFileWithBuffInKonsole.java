package Programmieren3.FileUndExceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileWithBuffInKonsole { //uebung7
    //Schreiben Sie ein Programm, welches eine Textdatei mittels BufferedReader einließt und bis zum Ende ließt und auf der Konsole ausgibt.
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\s54821\\Hallo1\\meinText.txt");
        FileReader fileReader=new FileReader(f);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line;
        while((line= bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
