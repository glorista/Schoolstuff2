package Programmieren1.uebungenVonTagen.uebung0204;

import java.util.ArrayList;
import java.util.List;

public class FrameMain {
    public static void main(String[] args) {
        BackBoard backBoard = new BackBoard(Material.CORK,300.0,Color.BLACK, Fastening.GLUE, true,false,true);

        Passepartout passepartout = new Passepartout(BoardWeigth.STANDARD, PositionCutOut.MIDDLE,Color.ORANGE,true, 12.5, 16.5);

        Frame frame = new Frame(17.5,20.5,2,3, Material.WOOD, Glass.RECYCLED, Color.GREEN,backBoard, passepartout);

        List<Frame> ShoopingCart = new ArrayList<>();
        ShoopingCart.add(frame);
        ShoopingCart.add(new Frame(16.1,25.4,15.4,25.6,Material.MIRROR,Glass.ACRYLIC,Color.BROWN,backBoard,passepartout));

        System.out.println("Es sind zurzeit: "+ShoopingCart.size()+ " Frames im Einkaufswagen");

        for ( Frame f: ShoopingCart){
            System.out.println(f);
        }

    }
}
