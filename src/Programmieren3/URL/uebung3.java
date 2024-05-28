package Programmieren3.URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class uebung3 {
    public static void main(String[] args) throws IOException {
        //port37 oder 13
        Socket timeSocket = new Socket("time-a.timefreq.bldrdoc.gov",13);
        BufferedReader br = new BufferedReader(new
                InputStreamReader(timeSocket.getInputStream()));
        System.out.println(br.readLine());
        System.out.println(br.readLine());

    }
}
