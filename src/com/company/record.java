package com.company;

public abstract class record {
    private int id;
    private static int counter = 0;

    public record() {
        counter++;
        id = counter;

    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(" id : %d", id);
    }
}
