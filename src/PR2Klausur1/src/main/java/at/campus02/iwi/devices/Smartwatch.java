package PR2Klausur1.src.main.java.at.campus02.iwi.devices;

public class Smartwatch extends Device{
    protected int nrWristSize;

    public Smartwatch(String name, Processor processor, int releaseYear, int nrProduced, int nrWristSize) {
        super(name, processor, releaseYear, nrProduced);
        this.nrWristSize = nrWristSize;
    }

    @Override
    public double calculateProductionCost() {
        if(nrWristSize== 1){
            return 100;
        }else{
            double g=nrWristSize*100;
            double f= 100 *(nrWristSize*0.1-0.1)+100;
            return g+f;
        }
    }

    @Override
    public double calculateSupportCostForAYear(int year) {
        return 0;
    }

    public int getNrWristSize() {
        return nrWristSize;
    }

    public void setNrWristSize(int nrWristSize) {
        this.nrWristSize = nrWristSize;
    }

    @Override
    public String toString() {
        return "Smartwatch{" +
                "nrWristSize=" + nrWristSize +
                ", name='" + name + '\'' +
                ", processor=" + processor +
                ", releaseYear=" + releaseYear +
                ", nrProduced=" + nrProduced +
                '}';
    }
}