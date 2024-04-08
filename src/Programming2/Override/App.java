package Programming2.Override;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Student s = new Student("Max Mustermann");
        s.getInfo();
        Mentor m = new Mentor("Mentori", "Programming");
        m.getInfo();

        List<Person> everbody = new ArrayList<>();
        everbody.add(s);
        everbody.add(m);

        for ( Person p : everbody){
            p.getInfo();
        }

        //upcasten

        Person p2 =s; // das geht da wir wissen, dass Student sich von Person ableitet

        s.learn(); // student auf Studentreferenz kann lernen
        //p2.learn() geht nicht da er nur die Methoden und Attributen der Personenklasse angeboten werden
        //ABER bei Methodenüberschreibung wird die "neuste" Implementierung ausgeführt

        // downcasten
        // Student s2 = p2; geht nicht da Student spezieller als Person ist
        Student s2 = (Student)p2; //bei expliziet casten ist downcasten erlaubt aber nur auf meine Verantwortung, falls falsch Systemcrash

        Person p3 = m;
        // Student s3 = m; geht nicht

        //das ist aber falsch, da auf p3 ein Mentor ist
        //ClassCastException weil Java einen Mentor in einen Studenten umwandeln will
        //Student s3 = (Student) p3;
    }
}
