package Programming2.UebungsbspAbstrakt.Figures;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
    protected ArrayList<Figure> figuren = new ArrayList<>();

    public void add(Figure f){
        if(!figuren.contains(f)){
            figuren.add(f);
        }
    }

    public double getMaxPerimeter(){
        double max = 0;
        for (Figure f:figuren){
            if(f.getPerimeter()>max){
                max= f.getPerimeter();
            }
        }
        return max;
    }

    public double getAverageSize(){
        double s= 0;
        for(Figure f:figuren){
            s = f.getArea()+s;
        }
        s= s/ figuren.size();

        return s;
    }

    public HashMap<String, Double> getAreaBySizeCategories(){
        HashMap<String, Double> hm = new HashMap<>();
        double ksum = 0;
        double msum=0;
        double gsum =0;
        for (Figure f: figuren){
            if(f.getArea()<1000){
                ksum = ksum + f.getArea();
            } else if (f.getArea()>=1000 && f.getArea()<= 4999) {
                msum=msum+f.getArea();
            }else {
                gsum = gsum + f.getArea();
            }
        }
        hm.put("klein",ksum);
        hm.put("mittel",msum);
        hm.put("groß",gsum);

        return hm;
    }
}
