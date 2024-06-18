package Programmieren3.UebungForUni.src;

import java.io.*;
import java.net.*;

public class Netzwerk2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Hallo, hier ist das Netzwerk-Projekt");

        // Server-Socket erstellen und auf Port 8787 binden
        ServerSocket serverSocket = new ServerSocket(8787);
        System.out.println("Server wartet auf Verbindungen...");

        // Auf eingehende Verbindung warten
        Socket clientSocket = serverSocket.accept();
            System.out.println("Ein Client hat sich verbunden");
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println("Hallo Client!");



        while (true) {


            // Client begrüßen


            // Auf Eingabe des Clients warten
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            while (true) {
                String input = in.readLine();
                if (input == null) {
                    break;
                }

                if (input.equals("h")) {
                    out.println("Das ist die Hilfe");
                } else if (input.equals("q")) {
                    out.println("Auf Wiedersehen");
                    clientSocket.close();
                    System.out.println("Ende des Netzwerk-Projekts");
                    System.exit(0);
                }
            }

            clientSocket.close();
        }
    }
}

