public class objekt {

        public int radius;

    public objekt(int radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    public String toString() {
        return "Radius: "+radius + ", Fläche: " +getArea();
    }
}

