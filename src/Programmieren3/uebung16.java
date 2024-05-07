package Programmieren3;

import java.io.*;

public class uebung16 {

    //Schreiben Sie ein Programm, das ein String- Objekt „Hallo Welt“ in eine Datei „object.dat“ serialisiert
    // und anschließend aus dieser wieder ausliest und auf die Konsole schreibt.
    //Verwenden Sie die Klassen FileOutputStream und ObjectOutputStream sowie FileInputStream und ObjectInputStream
    //Verwenden Sie für das Schreiben die Methode writeObject(…), für das Lesen die Methode readObject(). Beim Lesen müssen Sie das Ergebnis in einen String casten
    //Betrachten Sie die Datei in einem Editor (Notepad, Notepad++)

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\s54821\\Hallo1\\object.dat");

        FileOutputStream fos = null;
        FileInputStream fis = null;
        ObjectOutputStream oos= null;
        ObjectInputStream ois = null;
        String obj = "Hallo Welt";

        try{
            fos = new FileOutputStream("C:\\Users\\s54821\\Hallo1\\object.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
            System.out.println("File erfolgreich geschrieben");
            fis = new FileInputStream("C:\\Users\\s54821\\Hallo1\\object.dat");
            ois = new ObjectInputStream(fis);
            String gelesen = (String) ois.readObject();

        }catch (IOException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            System.out.println("Fehler beim Einlesen: Class not found");
            throw new RuntimeException(e);
        }finally {
            try{
                oos.close();
                ois.close();
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }
}

//    String[] diplomacyInfo = {"France is at war with Russia, Spain has taken a neutral position"};
//
//       SavedGame savedGame = new SavedGame(territoryInfo, resourceInfo, diplomacyInfo);
//
//       // Create 2 streams to serialize the object and save it to a file
//       FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Username\\Desktop\\save.ser");
//       ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//
//       // Save the game to a file
//       objectOutputStream.writeObject(savedGame);
//
//       // Close the stream and release resources
//       objectOutputStream.close();
//   }
