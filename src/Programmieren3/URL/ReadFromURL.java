package Programmieren3.URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadFromURL {

    public static void main(String[] args) throws IOException {
        URL myURL = new URL("https://moodle.campus02.at/mod/assign/view.php?id=173238");
        BufferedReader bf = new BufferedReader(new InputStreamReader(myURL.openStream())); //openStream baut Verbindung auf, braucht man
        String myString = null;
        while((myString= bf.readLine()) != null){
            System.out.println(myString);
        }
        bf.close();

    }



}
