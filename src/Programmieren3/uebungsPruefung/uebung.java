package Programmieren3.uebungsPruefung;

import java.io.*;
import java.net.Socket;

public class uebung {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket chatSocket = new Socket("bernhardfuchs.at", 40062);
        //user Input:
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        //writer to chat:
        PrintWriter chatOutput = new PrintWriter(new OutputStreamWriter(chatSocket.getOutputStream()));

        //Reader vom Chat
        BufferedReader chatInput = new BufferedReader(new InputStreamReader(chatSocket.getInputStream()));

        File logfile = new File("C:\\Users\\s54821\\Hallo1\\text7.txt");


        //damit schreibe ich was in den Chat:
        while (true) {
            if (userInput.ready()) {
                String userInputString = userInput.readLine();
                //System.out.println("Debug: Text" + userInputString + "zu Chat");
                chatOutput.println("---> DATEN GESENDET VON USER: " + userInputString);
                chatOutput.flush();
            }
            if (chatInput.ready()) {
                System.out.println("<--- DATEN VOM CHAT " + chatInput.readLine());
            }
            Thread.sleep(2000);
            //sind Daten vom Chat verfügbar

        }
    }
}

