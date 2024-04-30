package Programmieren3;

import java.io.File;
import java.util.Arrays;

public class uebung2 {
    //Write a program, which lists all files / directories of the given directory (without sub directories)
    //And make a different output for Files and Directories, for example:

    public static void main(String[] args) {
        File f = new File("C:\\Users\\s54821\\Web");
        System.out.println(Arrays.toString(f.listFiles()));


    }
}
