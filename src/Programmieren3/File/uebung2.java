package Programmieren3.File;

import java.io.File;
import java.util.Arrays;

public class uebung2 {
    //Write a program, which lists all files / directories of the given directory (without subdirectories)
    //And make a different output for Files and Directories, for example:

    public static void listFilesAndDir(File f){
        File[] arr =f.listFiles();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isFile()){
                System.out.println("F:"+arr[i].getAbsolutePath());
            }else{
                System.out.println("Dir:"+arr[i].getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        File f = new File("C:\\Users\\s54821");
        //System.out.println(Arrays.toString(f.listFiles()));
        File f2 = new File("C:\\Users\\s54821\\IdeaProjects");
        listFilesAndDir(f);



    }
}
