package Programmieren3.FileUndExceptions;

import java.io.File;

public class ListFilesPlusDirPlusSize { //uebung4
    //Goal: Write a program, which prints all files + relevant attributes of the files to the console. And we also want to know how much storage they need. (Print the total storage of the files to the console at the end.)
    //Tip: use listFiles()
    //Details:
    //Create a method, which takes a file as parameter. (Directory Path)
    //- Check if the File is a Directory
    //- All files of the given directory need to be printed, with the following content:
    //- File Name
    //- File Path
    //- File Size
    //- In the end we also want to know, what is the size of all files together? (Print it to console)

    public static void listFilesAndDir(File f) {
        int sum=0;
        File[] arr2 = f.listFiles();
        if (arr2 == null) {
            return;
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].isFile()) {
                System.out.println("F:" + arr2[i].getAbsolutePath());
                System.out.println(arr2[i].getName());
                System.out.println(arr2[i].length());
                sum= (int) (sum+arr2[i].length());
            } else if (arr2[i].isDirectory()) {
                System.out.println("---Dir:" + arr2[i].getAbsolutePath());

            }
        }
        System.out.println("Summe "+sum);
    }

    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\s54821\\Documents\\My Web Sites\\WebSite1");
        listFilesAndDir(f1);
    }
}
