package Programmieren2.UebungVergleichen.Ente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntenHausen {
    private List<Ente> enten = new ArrayList<>();

    public void addEnte(Ente e){
        if(!enten.contains(e)){
            enten.add(e);
        }
    }

    public Map<Integer,List<Ente>> getGruppierteEnten(){
        Map<Integer,List<Ente>> entenGruppiert = new HashMap<>();
        ArrayList<Ente> e100,e200,e300;
        e100 = new ArrayList<>();
        e200 = new ArrayList<>();
        e300 = new ArrayList<>();

        for (Ente e:enten){
            if(e.getFullWeigth()<=100){
                e100.add(e);
            }else if(e.getFullWeigth()<=200){
                e200.add(e);
            }else{
                e300.add(e);
            }
        }
        entenGruppiert.put(100,e100);
        entenGruppiert.put(200,e200);
        entenGruppiert.put(300,e300);
        return entenGruppiert;
    }

}


