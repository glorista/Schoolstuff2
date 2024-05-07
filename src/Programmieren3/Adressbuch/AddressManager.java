package Programmieren3.Adressbuch;

import java.io.File;
import java.io.IOException;
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

    public void exportToCsv(String path, String separator) throws AddressExportException{
        File f = new File(path);

//        try{
//
//
//        }catch (IOException e){
//            throw new AddressExportException();
//        }
    }
}
