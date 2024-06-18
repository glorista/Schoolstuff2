package Programmieren2.uebung2003.Collections;

public class Animal {
    private String name;
    private String species;
    private AnimalType tierArten;

    public Animal(String name, String species, AnimalType tierArten) {
        this.name = name;
        this.species = species;
        this.tierArten = tierArten;
    }

    @Override
    public String toString() {
        return "Vorstellung: " +name + " ist ein(e) "+ species + " und gehört zu den "+ tierArten;
    }
}
