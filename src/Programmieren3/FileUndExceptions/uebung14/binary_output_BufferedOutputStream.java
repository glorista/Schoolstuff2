package Programmieren3.FileUndExceptions.uebung14;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class binary_output_BufferedOutputStream {

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\s54821\\Hallo1\\text5.txt");
        FileOutputStream fos = new FileOutputStream(f);
        BufferedOutputStream bos = new BufferedOutputStream(fos);


        bos.write("Hello world öüöäü".getBytes(StandardCharsets.UTF_8)); //kann auch ohne StandardCh...
        bos.flush();
        bos.close();
    }
}
