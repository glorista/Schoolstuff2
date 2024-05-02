package Programmieren3;

import java.io.File;

public class uebung3 {
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
