package Programmieren3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class uebung6 {
    //Goal: Create 10 Files + Rename all files (only files) of the given directory (not for subdirectories)
    //
    //1. Write a method, which creates 10 files, in a given directory (= Method Parameter) and with a random file name/number (Tip: concatenate for final filepath)
    //2. Write a method, which renames all files (only files and not directories!) within a given folder (= Method Parameter)
    //2.1 for example: test.txt to 1_test.txt
    //2.1.1 for the new file name - concatenate a string with .getParent(), separator + pre_id + getName()
    //2.1.2 use renameTo() method
    //2.1.3 Check if the rename was a success (via if) and print the according message to the console
    //3. Write a method, which deletes all files within this directory. (Comment out this or other methods to test it...)
    //
    //Tip: Random Number:
    //ThreadLocalRandom.current().nextInt()

    public static void createTenFiles(String path) throws IOException {
        File f = new File(path);


        if (f.isDirectory()) {
            for (int i = 0; i < 10; i++) {
                //int z= ThreadLocalRandom.current().nextInt();
                String randomFileName = "datei_" + ThreadLocalRandom.current().nextInt() + ".txt";
                File f1 = new File(f.getAbsolutePath() + "\\" + randomFileName);
                f1.createNewFile();
            }
        }
    }

    public static void renameAllFiles(String path) {

        File f = new File(path);
        String preID = "neuNeu_";

        for (File f1 : f.listFiles()) {
            String newName = f.getAbsolutePath() + File.separator + preID + f1.getName();
            boolean renamesuccess = f1.renameTo(new File(newName));
            if (renamesuccess) {
                System.out.println("success");
            } else {
                System.out.println("failed");
            }
        }
    }

    public static void deleteFiles(String path) {
        File f = new File(path);
        //f.listFiles() geht in den Ordner

        for (File f1 : f.listFiles()) {
            if (f1.exists() && f1.isFile()) {

                if (f1.delete()) {
                    System.out.println("Delete successful");
                } else {
                    System.out.println("Error");
                }
            }

        }
    }


    public static void main(String[] args) throws IOException {
        //createTenFiles("C:\\Users\\s54821\\Hallo1");
        //renameAllFiles("C:\\Users\\s54821\\Hallo1");
        deleteFiles("C:\\Users\\s54821\\Hallo1");
    }
}
