package Programming2.Override;

public class Lecturer extends Person{
    private String favTopic;
    public Lecturer(String name, String favTopic) {
        super(name);
        this.favTopic = favTopic;
    }

    @Override
    public void getInfo() {
        System.out.println("Lecturer "+ name + " loves talking about "+favTopic);
        //super.getInfo();
    }
}
