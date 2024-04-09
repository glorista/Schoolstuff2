package Programming2.LogisticManager;

import java.util.ArrayList;

public class LogisticManager {
    protected ArrayList<Moveable> objects = new ArrayList<>();

    public void addObjects(Moveable m){
        if(!objects.contains(m)){
            objects.add(m);
        }
    }

    public void moveAll (String destination){
        for(Moveable m : objects){
            m.move(destination);
        }
    }
}
