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


//SEINE LÖSUNG
//public class AddressManager {
//    private ArrayList<Address> addresses = new ArrayList<>();
//
//    public void add(Address a) {
//        addresses.add(a);
//    }
//
//    public void printAllAddresses() {
//        System.out.println("---- All addresses in AddressManager: ----");
//        int o = 0;
////        for (Address one_address : addresses) {
////            System.out.println("Eintrag " + o + ": " + one_address.toString());
////            o++;
////        }
//        for (int i = 0; i < addresses.size(); i++) {
//            System.out.println("Eintrag " + i + ": " + addresses.get(i).toString());
//        }
//
////        addresses.forEach((one_address) -> {System.out.println("Eintrag: " + one_address.toString());});
//    }
//
//    public void exportToCsv(String path, String separator) throws AddressExportException, AddressExportFileAlreadyExistsException {
//        File f = new File(path);
//        System.out.println("File Path: " + f.getAbsolutePath());
//        if (f.exists()) { // existiert das file? -> Exception
//            throw new AddressExportFileAlreadyExistsException("lol, file already esists");
//        }
//
//        FileWriter fw = null;
//        BufferedWriter bw = null;
//
//        try { // neues File öffnen
//            fw = new FileWriter(f);
//            bw = new BufferedWriter(fw);
//            System.out.println("exportToCsv: baue String zum exportieren zusammen...");
//            for (Address one_address : addresses) {
//                String one_line = one_address.getFirstname() + separator +
//                        one_address.getLastname() + separator +
//                        one_address.getMobilNumber() + separator +
//                        one_address.getEmail();
//                System.out.println("Eintrag: " + one_line); // auf die Konsole schreiben
//                bw.write(one_line);
//                bw.newLine();
//                //in die Datei schreiben
//            }
//            bw.flush();
//            bw.close();
//        } catch (IOException e) {
//            throw new AddressExportException(e.getMessage());
//        }
//    }
//
//    public void loadFromCsv(String path, String separator) throws AddressLoadException, AddressLoadWrongFormatException {
//        addresses.clear(); // Clear the List, we will fill it with the Addresses from the CSV
//        String oneLineFromFile = ""; // ""King❤Kong❤+81 316 7❤kong@superking.biz";
//        System.out.println("loadFromCsv--------------");
//        Address tmpAddress = null;
//        try {
//            File f = new File(path);
//            FileReader fr = new FileReader(f);
//            BufferedReader br = new BufferedReader(fr);
//            while ((oneLineFromFile = br.readLine()) != null) {
//                String[] outputArray = oneLineFromFile.split(separator, 4);
//                String firstname = outputArray[0];
//                String lastname = outputArray[1];
//                String mobilNumber = outputArray[2];
//                String email = outputArray[3];
//                tmpAddress = new Address(firstname, lastname, mobilNumber, email);
//                System.out.println("Gelesene Adresse: " + tmpAddress.toString());
//                addresses.add(tmpAddress);
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new AddressLoadWrongFormatException(e.getMessage());
//        } catch (FileNotFoundException e) {
//            throw new AddressLoadException(e.getMessage());
//        } catch (IOException e) {
//            throw new AddressLoadException(e.getMessage());
//        }
//
//    }
//
//    public ArrayList<Address> getAddresses() {
//        return addresses;
//    }
//}