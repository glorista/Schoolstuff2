package Programmieren3.FileUndExceptions;

import java.io.*;

public class uebung12_withExceptions {

    //Implementieren Sie ein Binary Input Beispiel von den Folien (nicht selbst erarbeitet).
    //Aufgabenstellung später, mit Exceptions:--------------
    //Aufgabe:
    //Schreiben Sie Übung 12 neu (mit Exceptions):
    //1) löschen Sie den "throws IOExeption" Text aus der Methodensignatur von Main
    //2) behandeln Sie die (möglicherweise) auftretenden Exceptions mit try/catch
    public static void main(String[] args) {


        File f = new File("C:\\Users\\s54821\\Hallo1\\text1.txt");
        BufferedInputStream bis = null;

        try {
            FileInputStream fis = new FileInputStream(f);
            bis = new BufferedInputStream(fis);

            int byteRead = 0;
            int i = 0;

            while ((byteRead = bis.read()) != -1) {
                //char[] ch = Character.toChars(byteRead);
                //System.out.println(ch[0]);
                System.out.print(i + ": ");
                System.out.print(byteRead);
                System.out.println("\t'" + (char) byteRead + "'");
                i++;
            /*
            if(i>=3){
                break;
            }
             */
            }
           // throw new FileNotFoundException(); somit lösen wir eine Fehlermeldung aus
        }
        catch (IOException e) {
            if ( e instanceof FileNotFoundException){
                System.err.println("This was a FileNotFoundException");
            }else{
                System.err.println("This was another exception");
            }
            e.printStackTrace();
        } finally {
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
