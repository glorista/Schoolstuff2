package Programmieren3;

import java.io.*;

public class uebung10 {
    //Schreiben Sie ein Programm, das Ihre Noten aus allen
    //Fächern im ersten Semester von der Konsole einliest
    //und anschließend als „.txt“ Datei speichert.
    //Beispiel:
    //▪ PR1: 1
    //▪ Englisch: 1
    //Die Eingabe endet, wenn das Wort „STOP“ eingegeben
    //wird.
    //Verwenden Sie die Klassen BufferedReader,
    //InputStreamReader und FileWriter
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\s54821\\Hallo1\\text1.txt");
        FileWriter fw = new FileWriter(f);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String oneNote =" ";

        while(!oneNote.equalsIgnoreCase("Stop")){
            oneNote= br.readLine();
            if(oneNote.equalsIgnoreCase("Stop")){
                break;
            }
            fw.write(oneNote+"\n");
        }
        fw.flush();
        fw.close();
        br.close();
    }
}
// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String oneLine = " ";
//        while(!oneLine.equalsIgnoreCase("Stop")){
//            oneLine= reader.readLine();
//            System.out.println(oneLine);
//        }
//        reader.close();