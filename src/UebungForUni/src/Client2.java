package UebungForUni.src;

import java.io.*;
import java.net.*;
public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8787);
        System.out.println("Verbindung zum Server hergestellt");

        // Ausgabe an den Server senden
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        // Eingabe vom Benutzer lesen
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        // Antwort vom Server lesen
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String input;
        while (true) {
            String response = in.readLine();
            System.out.println("Server: " + response);

            input = userInput.readLine();
            out.println(input);



            if (input.equals("q")) {
                break;
            }
        }

        socket.close();
    }
}
