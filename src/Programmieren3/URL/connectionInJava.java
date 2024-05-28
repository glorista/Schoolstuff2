package Programmieren3.URL;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class connectionInJava {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket chatSocket = new Socket("bernhardfuchs.at", 40062);
        //user Input:
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        //writer to chat:
        PrintWriter chatOutput = new PrintWriter(new OutputStreamWriter(chatSocket.getOutputStream()));

        //Reader vom Chat
        BufferedReader chatInput = new BufferedReader(new InputStreamReader(chatSocket.getInputStream()));


        //damit schreibe ich was in den Chat:
        while (true) {
            if (userInput.ready()) {
                String userInputString = userInput.readLine();
                //System.out.println("Debug: Text" + userInputString + "zu Chat");
                chatOutput.println("Gloria schreibt: "+userInputString);
                chatOutput.flush();
            }
            if(chatInput.ready()){
                System.out.println("Daten vom Chat: "+chatInput.readLine());
            }
            Thread.sleep(2000);
            //sind Daten vom Chat verfügbar

        }


        //System.out.println("Chat beendet sich");


//
//        Socket socket = null;
//        try {
//            socket = new Socket("bernhardfuchs.at", 40062);
//
//            OutputStream raus = socket.getOutputStream();
//            PrintStream ps = new PrintStream(raus, true);
//            ps.println(System.in);
//
//
//            InputStream rein = socket.getInputStream();
//            System.out.println("verf\u00FCgbare Bytes: " + rein.available());
//            BufferedReader buff = new BufferedReader(new InputStreamReader(rein));
//
//            String output;
//
//            while((output= buff.readLine()) !=null){
//                System.out.println("schreibt..."+output);
//            }
//            while (buff.ready()) {
//                System.out.println(buff.readLine());
//            }
//
//        } catch (UnknownHostException e) {
//            System.out.println("Unknown Host...");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("IOProbleme...");
//            e.printStackTrace();
//        } finally {
//
//            if (socket != null)
//                try {
//                    socket.close();
//                    System.out.println("Socket geschlossen...");
//                } catch (IOException e) {
//                    System.out.println("Socket nicht zu schliessen...");
//                    e.printStackTrace();
//                }
//        }
    }
}
