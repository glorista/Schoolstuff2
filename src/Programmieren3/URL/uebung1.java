package Programmieren3.URL;

import java.io.*;
import java.net.URL;

public class uebung1 {

    //wir lesen aus einer Datei einen URL ein und schreiben dann den HTML text, des URL in eine neue Datei ein

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\s54821\\Hallo1\\text5.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line = null;

        File f1 = new File("C:\\Users\\s54821\\Hallo1\\content.html");
        FileWriter fw = new FileWriter(f1);
        BufferedWriter bw = new BufferedWriter(fw);

        line = br.readLine();
        URL myURL = new URL(line);
        BufferedReader bf = new BufferedReader(new InputStreamReader(myURL.openStream())); //openStream baut Verbindung auf, braucht man
        while ((line = bf.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        bf.close();
        br.close();

    }
}


