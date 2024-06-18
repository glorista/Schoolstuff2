package Programmieren3.UebungForUni.src;

import java.io.*;
import java.net.URL;

public class UrlDownload {
    public static void main(String[] args) throws IOException {
        URL u1 = new URL("https://de.wikipedia.org/wiki/Objektorientierte_Programmierung");
        BufferedReader br = new BufferedReader(new InputStreamReader(u1.openStream()));
        String myString = null;
        File f = new File("content.html");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        while ((myString= br.readLine()) != null){
            bw.write(myString+System.lineSeparator());
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
