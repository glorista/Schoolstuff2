package uebungenVonTagen.uebung1503;

public class Teilnehmer {

    private String name;
    private int alter;
    private String adresse;
    private int counter;

    public Teilnehmer(String name, int alter, String adresse) {
        this.name = name;
        this.alter = alter;
        this.adresse = adresse;
        this.counter = 0;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCounter() {
        return counter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void hatFrageGestellt(){
        counter++;
    }

    public int ausgabeFragenCounter(){
        return getCounter();
    }

    public void teilnehmerInfo(){
        System.out.println("Name: "+ getName()+ "\nAlter: "+getAlter()+ "\nAdresse: "+getAdresse()+"\nHat so viele Fragen gestellt: "+getCounter());
    }

}
