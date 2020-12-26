package com.company;

public class Pet extends Record {
    private String pet;
    private Species species;

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s Pet: %s; Species: %s", str, pet, species);
    }

    @Override
    public void askData() {
        pet = InputUtils.askString("Pet's name");
        for (Species species : Species.values()
        ) {
            System.out.println(species);
        }
        pet = InputUtils.askString("Choose species");

    }
}
