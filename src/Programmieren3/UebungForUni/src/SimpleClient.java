package Programmieren3.UebungForUni.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 8787; // This should match the server's port

        try (Socket socket = new Socket(hostname, port)) {
            System.out.println("Connected to the server");


            // Create input and output streams to communicate with the server
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Send a message to the server
            String message = "Hello from client";
            output.println(message);
            while(!message.equalsIgnoreCase("q")){
                String response = input.readLine();
                System.out.println("Received from server: " + response);
            }

            // Read the response from the server


            // Close the connection

            socket.close();
            System.out.println("Connection closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
