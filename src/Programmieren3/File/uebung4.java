package Programmieren3.File;

import java.io.File;

public class uebung4 {
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
