package Programmieren3.UebungForUni.src;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Netzwerk {
    public static void main(String[] args) throws IOException {
        int port = 8787; // You can use any available port
        System.out.println("Hallo, hier ist das Netzwerk-Projekt");
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            // Wait for a client connection
            Socket socket = serverSocket.accept();
            System.out.println("Hallo Client!");
            System.out.println("Ein Client hat sich verbunden");

            // Create input and output streams to communicate with the client
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Read a message from the client
            String clientMessage = input.readLine();
            System.out.println("Received from client: " + clientMessage);
            if(clientMessage.equalsIgnoreCase("h")){
                System.out.println("Das ist die Hilfe");
            }
            if(clientMessage.equalsIgnoreCase("q")){
                System.out.println("Auf Wiedersehen");
                System.out.println("Ende des Netzwerk-Projekts");
                socket.close();
            }

            // Send a response to the client
            String response = "Hello from server";
            output.println(response);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
