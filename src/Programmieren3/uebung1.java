package Programmieren3;

import java.io.File;

public class uebung1 {
    //Create a method, which has a file as parameter
    //The method should print the following information of a file on the console:
    //- Does this file exist?
    //- Name of the File
    //- Parent Directory of the File
    //- Path to this File
    //- Is this a directory?
    //- Is this a file?
    //- Is this file readable?
    //- Is this File writeable
    //- File Size

    public static void method() {
        File f = new File("C:\\Users\\s54821\\Web\\Web1.1\\kontaktformular.html");

        /* Überprüfung, ob die mit dem Pfad assozierte Datei
           bzw. Verzeichnis existiert */
        if (f.exists()) {
            System.out.println("existiert");

        } else {
            System.out.println("existiert nicht");
        }

        System.out.println(f.getName());
        System.out.println(f.getParent());
        System.out.println(f.toPath());
        System.out.println("Is directory:"+f.isDirectory());
        System.out.println("Is file:"+f.isFile());
        System.out.println("readable: "+ f.canRead());
        System.out.println("writeable: "+f.canWrite());
        System.out.println(f.length());

    }

    public static void main(String[] args) {
        method();




    }
}
