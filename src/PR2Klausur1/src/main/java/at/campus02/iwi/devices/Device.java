package PR2Klausur1.src.main.java.at.campus02.iwi.devices;

import PR2Klausur1.src.main.java.at.campus02.iwi.devices.Processor;

public abstract class Device {
    protected String name;
    protected Processor processor;
    protected int releaseYear;
    protected int nrProduced =0;

    public Device(String name, Processor processor, int releaseYear, int nrProduced) {
        this.name = name;
        this.processor = processor;
        this.releaseYear = releaseYear;
        this.nrProduced = nrProduced;
    }

    public void setNrProduced(int nrProduced) {
        this.nrProduced = nrProduced;
        if (nrProduced<0){
            nrProduced=0;
        }
    }

    public abstract double calculateProductionCost();

    public abstract double calculateSupportCostForAYear(int year);

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", processor=" + processor +
                ", nrProduced=" + nrProduced +
                '}';
    }
}
