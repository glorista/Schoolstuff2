public class Rechteck {

    public int a;
    public int b;

    public Rechteck(int a, int b) {
        this.a= a;
        this.b= b;
    }
    public double umfang(){
        return 2*a+2*b;
    }
    public double flaeche(){
        return a*b;
    }
    public double diagonale(){
        return Math.sqrt(a*a+b*b);
    }

    @Override
    public String toString() {
        return "Der Umfang ist: "+ ((2*a)+(2*b))+"\nDie Fläche ist: "+(a*b)+"\nDie Diagonale ist: "+Math.sqrt(a*a+b*b);
        //\n für zeilenumbruch muss innerhalb"" sein
    }
}
