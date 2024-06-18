package Programmieren2.PR2Klausur1.src.main.java.at.campus02.iwi.devices;

public class Tablet extends Device {
    protected boolean arCamera;

    public Tablet(String name, Processor processor, int releaseYear, int nrProduced, boolean arCamera) {
        super(name, processor, releaseYear, nrProduced);
        this.arCamera = arCamera;
    }

    @Override
    public double calculateProductionCost() {
        double kosten=0;
        switch(processor.getGeneration()){
            case 1:
                if(processor.getNrCores()==1){
                    kosten=150;
                }else if(processor.getNrCores()>=2){
                    kosten=200;
                }
                break;
            case 2:
                if(processor.getNrCores()>= 1 && processor.getNrCores()<=3){
                    kosten=350;
                } else if (processor.getNrCores()>=4 && processor.getNrCores()<=7) {
                    kosten=400;
                }else if (processor.getNrCores()>=8){
                    kosten=450;
                }
                break;
            default:
                kosten=700;
        }

        if(arCamera==true){
            kosten=kosten+50;
        }
        return kosten *nrProduced ;
    }

    @Override
    public double calculateSupportCostForAYear(int year) {
        return 0;
    }

    public boolean getArCamera() {
        return arCamera;
    }

    public void setArCamera(boolean arCamera) {
        this.arCamera = arCamera;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "arCamera=" + arCamera +
                ", name='" + name + '\'' +
                ", processor=" + processor +
                ", releaseYear=" + releaseYear +
                ", nrProduced=" + nrProduced +
                '}';
    }
}