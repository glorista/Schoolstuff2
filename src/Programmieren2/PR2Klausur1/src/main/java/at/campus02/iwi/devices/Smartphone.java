package Programmieren2.PR2Klausur1.src.main.java.at.campus02.iwi.devices;

public class Smartphone extends Device {

  protected int nrCameras;

    public Smartphone(String name, Processor processor, int releaseYear, int nrProduced, int nrCameras) {
        super(name, processor, releaseYear, nrProduced);
        this.nrCameras = nrCameras;
    }

    @Override
    public double calculateProductionCost() {
        double processorKosten=processor.getGeneration()*100;
        double kameraKosten=nrCameras*20;
        if(nrProduced>= 100000 && nrProduced< 1000000){
            double mengenRabatt=processorKosten+kameraKosten*0.1;
            return mengenRabatt;
        }else if (nrProduced>=1000000){
            double mengenRabatt = processorKosten+kameraKosten*0.2;
            return mengenRabatt;
        }
        return processorKosten+kameraKosten;
    }

    @Override
    public double calculateSupportCostForAYear(int year) {
        return 0;
    }

    public int getNrCameras() {
        return nrCameras;
    }

    public void setNrCameras(int nrCameras) {
        this.nrCameras = nrCameras;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "nrCameras=" + nrCameras +
                ", name='" + name + '\'' +
                ", processor=" + processor +
                ", releaseYear=" + releaseYear +
                ", nrProduced=" + nrProduced +
                '}';
    }
}