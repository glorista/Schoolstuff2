package Programmieren3.Threads.AbschlussUebung;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadWorker extends Worker implements Runnable{

    private String path;
    public ArrayList<String> lines = new ArrayList<>();
    public FileReadWorker(String name,String path) {
        super(name);
        this.path=path;
    }

    @Override
    public void work() {
        printStarted();
        lines.clear();
        String line;
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line= br.readLine()) != null){
                lines.add(line);
                if(!shouldRun){
                    break;
                }
                Thread.sleep(1000);
            }
            br.close();
            shouldRun=false;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        printStopped();
    }

    @Override
    public void run() {
        work();
    }
}
