package Programmieren3.FileUndExceptions;

import java.io.File;

public class FilesOrDirWithSubDir { //uebung3
    //Write a program, which lists all files / directories of the given directory + their sub directories
    //Tip:Recursive call
    //Example Output:
    //Original Path: C:\Users\n50348\Desktop
    //File: C:\Users\n50348\Desktop\desktop.ini

    public static void listFilesAndDir(File f) {
        File[] arr2 = f.listFiles();
        if (arr2 == null) {
            return;
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].isFile()) {
                System.out.println("F:" + arr2[i].getAbsolutePath());
            } else if (arr2[i].isDirectory()) {
                System.out.println("---Dir:" + arr2[i].getAbsolutePath());
                listFilesAndDir(arr2[i]);

            }
        }
    }

    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\s54821\\IdeaProjects\\untitled");
        listFilesAndDir(f1);
    }
}
