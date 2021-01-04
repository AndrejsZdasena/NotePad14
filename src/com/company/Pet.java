package com.company;

import java.util.Scanner;

public class Pet extends Record {
    private static final Scanner scanner = new Scanner(System.in);
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
        //while (true) {
        // try {
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
}
