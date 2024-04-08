package Programming2.Override;

public class Mentor extends Lecturer {

    private boolean happy;


    public Mentor(String name, String favTopic) {
        super(name, favTopic);
        happy = true;
    }
}
