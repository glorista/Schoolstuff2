package Programmieren3.Adressbuch;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressManager {
    private List<Address> addressList = new ArrayList<>();

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public void add(Address a){
        if(!addressList.contains(a)){
            addressList.add(a);
        }
    }

    public void exportToCsv(String path, String separator) throws AddressExportException, IOException,AddressExportFileAlreadyExistsException {
        File f = new File(path);
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            if (f.exists()) {
                for (Address a : addressList) {
                    bw.write(a.toString());
                    bw.newLine();
                }
                bw.flush();
                bw.close();
            }else{
                throw new AddressExportFileAlreadyExistsException();
            }
        }catch (IOException ioException){
           throw new AddressExportException();
        }

    }

    public void  loadFromCsv(String path, String separator) throws IOException, AddressLoadException {
        File f = new File(path);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;

        try{
            while((line=br.readLine()) != null) {
                System.out.println(line);

            }
        }catch (IOException e){
                throw new AddressLoadException();

        }finally{
            br.close();
        }


    }
}

// public void readFromFile(String path) throws IOException {
//        File f = new File(path);
//        FileReader fileReader= new FileReader(f);
//        BufferedReader bufferedReader=new BufferedReader(fileReader);
//        String line;
//        while((line= bufferedReader.readLine()) != null){
//            System.out.println(line);
//        }
//        bufferedReader.close();
//    }


