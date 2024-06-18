package Programmieren3.FileUndExceptions;

import java.io.*;

public class KonsoleInDateiSchreiben { //uebung10
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
    //Stop schreiben und dann ist es in der Datei
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

//SEINE LÖSUNG
//public class ue_10_write_file_from_user_input {
//    /*
//     Schreiben Sie ein Programm, das Ihre Noten aus allen
//     Fächern im ersten Semester von der Konsole einliest und
//     anschließend als „.txt“- Datei speichert.
//     Z.B.: PR1: 1 Englisch: 1 •
//     Die Eingabe endet, wenn das Wort „STOP“ eingegeben wird.
//     Verwenden Sie die Klassen BufferedReader, InputStreamReader und FileWriter.
//     */
//
//    public static void main(String[] args) throws IOException {
//        // Datei wird geöffnet und in PrintWriter gekapselt
//        File f = new File("campus02-test.txt");
//        FileWriter fileWriter = new FileWriter(f);
//        PrintWriter printWriter = new PrintWriter(fileWriter);
//
//        System.out.println("Bitte geben Sie ihr Fach sowie Note ein:");
//        // User Input kann empfangen werden
//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//        // legt einen BufferedReader über den inputStreamReader.
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//        // Zeile für Zeile wird eingelesen.
//        String line;
//        while (!(line = bufferedReader.readLine()).equals("STOP")) {
//            // Mittels println(...) werden Zeilen geschrieben. Jede Zeile wird richtig abgeschlosen.
//            printWriter.println(line);
//            // printWriter.flush();
//            System.out.println(line);
//        }
//        // bufferedReader schließen
//        bufferedReader.close();
//
//        // flush() löst das Schreiben aus
//        printWriter.flush();
//        printWriter.close();
//    }
//}