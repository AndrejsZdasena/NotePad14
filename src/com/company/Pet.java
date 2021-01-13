package com.company;


import java.io.PrintWriter;
import java.util.Scanner;

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
        System.out.println("Species:");
        for (Species species : Species.values()
        ) {
            System.out.println(species);
        }
        while (true) {
            try {

                var strSpc = InputUtils.askString("Choose kind of species");
                species = Species.valueOf(strSpc);
                break;

            } catch (IllegalArgumentException e) {

                System.out.println("Species name has lowercase");
            }
        }

    }

    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || pet.contains(substr)
                || species.toString().contains(substr);
    }

    @Override
    public void load(Scanner in) {
        super.load(in);
        pet = in.next();
        //species = in.next().toString(species);
    }

    @Override
    public RecordType getMyType() {
        return RecordType.PET;
    }
    public void printToFile(PrintWriter out) {
        super.printToFile(out);
        out.println(pet);
        out.println(species);
    }

}
