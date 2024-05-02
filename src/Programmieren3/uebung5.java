package Programmieren3;

import java.io.File;

public class uebung5 {
    //Tip: use mkdirs()
    //Write a method, which creates multiple directories. Example: "C:\\campus02\\test\\demo4" (Campus, Test, Demo4 will be created)
    //- It should also be checked, if the given directory has been created -> print it to the console:
    //-> IF Yes: Directory C:\campus02\test\demo4 created?: true
    //-> IF No: Directory C:\campus02\test\demo4 created?: false
    //
    //Question: What is the difference between mkdirs() and mkdir() ?
    //Question: What does mkdirs() return?
    //Question: What does mkdir() return?

    public static void createMultipleDir(String path){
        File f = new File(path);
        if(f.mkdirs()){
            System.out.println(f.getName()+" wurde erstellt");
        }else{
            System.out.println(f.getName()+" wurde nicht erstellt.");
        }


    }

    public static void main(String[] args) {
        createMultipleDir("C:\\Users\\s54821\\Hallo3");

    }
}
