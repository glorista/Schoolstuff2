package Programmieren3.FileUndExceptions;

import java.io.*;

public class ReadZeichenFuerZeichenXWillEnd { //uebung15
    //Lesen Sie Zeichen für Zeichen von der Konsole ein und schreiben
    //Sie die einzelnen Bytes in eine Datei.(deswegen keinen bufferedOutputStream
    //Von der Konsole kann mittels System.in.read() ein Zeichen gelesen
    //werden
    //Brechen Sie ab, wenn ein ‘x‘ eingegeben wird
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\s54821\\Hallo1\\text1.txt");
        FileOutputStream fos = new FileOutputStream(f);
//        BufferedOutputStream bos = new BufferedOutputStream(fos);

        char c;
        while((c=(char) System.in.read()) != 'x'){
            System.out.println(c);
            fos.write(c);
        }
        System.out.println("Es kam ein x");
        fos.flush();
        fos.close();



    }
}
