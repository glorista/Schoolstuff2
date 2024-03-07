public class Person {
    public String name;
    public String nachname;
    public int alter;
    public String[] haustiere;

    public Person(String name, String nachname, int alter) {
        this.name = name;
        this.nachname = nachname;
        this.alter = alter;
        haustiere=new String[3];
    }
    public String name(){
        return name+" "+nachname;
    }
    public int alter(){
        return alter;
    }
    public void neuesHaustier(String tier){

        for(int i=0; i< haustiere.length; i++){
            if (haustiere[i] == null){
                haustiere[i] =tier;
                break;
            }
        }
    }
    public int anzahlHaustiere(){
        int counter=0;
        for (String tier: haustiere){
            if(tier != null){
                counter++;

        }

        }
        return counter;
    }
    public void haustierinfo(){
        System.out.println(name+ " hat "+ anzahlHaustiere()+" Haustier(e):");
        for( String tier: haustiere){
            if(tier != null){
                System.out.println(tier+" ");
            }
        }
    }



    @Override
    public String toString() {
        return "Der freundliche "+name+" "+nachname+ " ist "+alter+ " Jahre alt!";
    }
}
